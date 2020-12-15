package com.weather.api.feignclient;
import com.weather.api.extservice.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


//https://jsonplaceholder.typicode.com
//https://api.openweathermap.org/data/2.5/onecall?lat=33.441792&lon=-94.037689&exclude=hourly,minutely,daily&appid=
//https://api.openweathermap.org/data/2.5/onecall?lat=33.441792&lon=-94.037689&exclude=hourly,daily&appid=

//http://api.openweathermap.org/data/2.5/weather?q=Amsterdam&appid=fa94c80da214e29fa2248f2642c34fb5

@FeignClient(url="http://api.openweathermap.org/data/2.5/weather?q=Amsterdam&appid=fa94c80da214e29fa2248f2642c34fb5",name = "WeatherApiClient")
public interface WeatherExtApi {

  @GetMapping("")
   public WeatherResponse getAll();

}
