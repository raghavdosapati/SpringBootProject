//package com.example.springcrudope.restapi.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class WeatherService {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    private static final String key="cbb349366b78533553acd98d2ac85435";
//    private static final String weatherurl="https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";
//
//    public String getWeatherDetails(String city){
//        String url=weatherurl.replace("{city}",city).replace("{apiKey}",key);
//        return restTemplate.getForObject(url, String.class);
//    }
//}
