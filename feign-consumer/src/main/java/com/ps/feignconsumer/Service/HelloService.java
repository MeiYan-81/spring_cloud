package com.ps.feignconsumer.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author VP
 * 使用Spring MVC 的注解来绑定具体改服务提供的 rest 接口
 * 这里服务名不区分大小写
 */
@FeignClient("cloud-app")
public interface HelloService {

    @RequestMapping("/hello")
    String hello(@RequestParam String name);

}
