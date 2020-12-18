package com.weather.api.feignclient;
import com.weather.api.extservice.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(url="http://api.openweathermap.org",name = "WeatherApiClient")
public interface WeatherExtApi {

@RequestMapping(method = RequestMethod.GET , path ="/data/2.5/weather?appid=fa94c80da214e29fa2248f2642c34fb5")
WeatherResponse getCity(@RequestParam(value="q") String city, @RequestParam(value="units") String units,  @RequestParam(value="lang") String language);

}


