package com.ps.helloapp.controller;

import com.ps.helloapp.controller.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        List<ServiceInstance> list = discoveryClient.getInstances("CLOUD-APP");
        if(list != null && list.size() > 0){
            System.out.println(list.get(0).getUri().toString());
            return list.get(0).getUri().toString();
        }
        return null;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(String name){
        System.out.println(name);
        return String.format("hello %s !",name);
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.POST)
    public String hello1(User user){
        System.out.println(user);
        return String.format("hello1 %s !",user);
    }

}
