package com.weather.api.feignclient;

import com.weather.api.extservice.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
//https://jsonplaceholder.typicode.com
//https://api.openweathermap.org/data/2.5/onecall?lat=33.441792&lon=-94.037689&exclude=hourly,minutely,daily&appid=fa94c80da214e29fa2248f2642c34fb5
//https://api.openweathermap.org/data/2.5/onecall?lat=33.441792&lon=-94.037689&exclude=hourly,daily&appid=fa94c80da214e29fa2248f2642c34fb5


@FeignClient(url="https://api.openweathermap.org/data/2.5/onecall?lat=33.441792&lon=-94.037689&exclude=hourly,minutely,daily&appid=fa94c80da214e29fa2248f2642c34fb5",name = "WeatherApiClient")
public interface WeatherExtApi {

@GetMapping("")
public List<Object> getCurrent();

}
