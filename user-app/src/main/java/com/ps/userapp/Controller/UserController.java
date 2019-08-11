package com.ps.userapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/login")
    public String login(String name){
        return restTemplate.getForObject("http://CLOUD-APP/hello?name="+name,String.class);
    }

}
