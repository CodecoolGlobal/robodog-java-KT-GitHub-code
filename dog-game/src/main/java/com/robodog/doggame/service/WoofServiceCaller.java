package com.robodog.doggame.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class WoofServiceCaller {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${woof.url}")
    private String baseURL;

    public String call(){
        String body = restTemplate.getForEntity(baseURL, String.class).getBody();
        return body;
    }

}
