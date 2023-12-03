package com.example.restclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClient {

    @Autowired
    private RestTemplate restTemplate;

    public void callMethod(){

        HttpEntity<String> request = new HttpEntity<>("bar");
        restTemplate.exchange("http://localhost:8080/student/addStudent", HttpMethod.POST, request, String.class);

        final ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8080/student/getStudents", String.class);
        System.out.println(forEntity.getStatusCode());
        System.out.println(forEntity.getBody());
    }


}
