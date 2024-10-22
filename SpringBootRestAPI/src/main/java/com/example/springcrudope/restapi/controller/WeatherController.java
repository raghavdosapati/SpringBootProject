//package com.example.springcrudope.restapi.controller;
//
//import com.example.springcrudope.restapi.service.WeatherService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class WeatherController {
//
//    @Autowired
//    private WeatherService weatherService;
//
//    @GetMapping("/weather-data")
//    public String getWeather(@RequestParam String city){
//        return weatherService.getWeatherDetails(city);
//    }
//}
