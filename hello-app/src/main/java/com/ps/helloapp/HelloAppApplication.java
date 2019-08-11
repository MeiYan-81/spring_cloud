package com.ps.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author VP
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloAppApplication.class, args);
    }

}
