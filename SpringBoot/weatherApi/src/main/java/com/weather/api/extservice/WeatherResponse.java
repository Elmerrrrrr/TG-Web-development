package com.weather.api.extservice;

import java.util.List;

public class WeatherResponse {

    //private String base;

    private ApiResponse sys;
    private List<Weather> weather;
    private Current main;



    public ApiResponse getSys() {
        return sys;
    }

    public Current getMain() {
        return main;
    }

    public List<Weather> getWeather() {
           return weather;
    }



}
