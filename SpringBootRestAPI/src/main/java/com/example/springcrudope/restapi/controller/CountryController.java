package com.example.springcrudope.restapi.controller;

import com.example.springcrudope.restapi.service.CountryService;
import com.example.springcrudope.restapi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

    @Autowired
    private NewsService newsService;


    @GetMapping("/country")
    public ResponseEntity<?> getInfoCountry(@RequestParam String name){
        return countryService.getInfo(name);
    }

    // news  service
    @GetMapping("/news")
    public ResponseEntity<?> getInfoNews(@RequestParam String country){
        return newsService.getNewsInfo(country);
    }

}
