package com.ps.feignconsumer.controller;

import com.ps.feignconsumer.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        return helloService.hello(name);
    }


}
