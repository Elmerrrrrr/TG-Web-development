package com.weather.api.controller;

import com.weather.api.extservice.WeatherResponse;
import com.weather.api.feignclient.WeatherExtApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClientController {

    private String units= "metric";
    private String lang= "nl";
    //private String appid= "fa94c80da214e29fa2248f2642c34fb5";

    // Injecting Interface Feign Class
    @Autowired
    private WeatherExtApi current;


    @GetMapping("/weather/{city}")
    public WeatherResponse getAll(@PathVariable String city) throws Exception{

        return current.getCity(city,units,lang);
    }
}
