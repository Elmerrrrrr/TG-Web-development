package com.weather.api.extservice;

import java.util.List;

public class WeatherResponse {

    private String base;

    private List<Weather> weather;





    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
