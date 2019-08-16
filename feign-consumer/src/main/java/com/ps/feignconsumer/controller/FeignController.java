package com.ps.feignconsumer.controller;

import com.ps.feignconsumer.Service.HelloService;
import com.ps.feignconsumer.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author VP
 */
@RestController
public class FeignController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloFeign(@RequestParam String name){
        System.out.println("name: "+name);
        return helloService.h(name);
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello(@RequestHeader String name){
        System.out.println("name: "+name);
        return helloService.h(name);
    }

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index(@RequestBody User user){
        System.out.println("name: "+user.getName());
        return helloService.h(user.getName());
    }

}
