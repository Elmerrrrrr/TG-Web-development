package com.weather.api;

import com.weather.api.extservice.ApiResponse;
import com.weather.api.extservice.Current;
import com.weather.api.feignclient.WeatherExtApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@SpringBootApplication
@RestController
@EnableFeignClients
public class WeatherApiApplication {

	@Autowired
	private WeatherExtApi current;

	@GetMapping("/current")
	public List<Object> getCurrent(){
		System.out.println(current);
		return current.getCurrent();

	}

	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}

}

