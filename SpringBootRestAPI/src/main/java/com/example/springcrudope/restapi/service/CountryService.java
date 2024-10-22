package com.example.springcrudope.restapi.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {

    private RestTemplate restTemplate;

    private final String baseurl = "https://restcountries.com/v3.1/name/";

    public CountryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<?> getInfo(String country) {
        String url = baseurl + country;
        try {
            String result = restTemplate.getForObject(url, String.class);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Country not found: " + country);
        }
    }
}
