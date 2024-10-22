package com.example.springcrudope.restapi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
    private RestTemplate restTemplate;
    private final String apiKey="a897ad06b0ed49a285bf8d7616950af5";
    private String url="https://newsapi.org/v2/top-headlines?country={country}&apiKey=" + apiKey;

    public NewsService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public ResponseEntity<?> getNewsInfo(String country){
        String res=restTemplate.getForObject(url, String.class,country);
        return ResponseEntity.ok(res);
    }
}
