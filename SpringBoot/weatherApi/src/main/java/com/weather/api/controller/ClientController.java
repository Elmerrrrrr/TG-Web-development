package com.weather.api.controller;

import com.weather.api.extservice.WeatherResponse;
import com.weather.api.feignclient.WeatherExtApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {


    // Injecting Interface Feign Class
    @Autowired
    private WeatherExtApi current;


    @GetMapping("/current")
    public WeatherResponse getAll(){

        return current.getAll();
    }
}
