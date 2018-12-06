package com.spring.cloud.eureka.consumer.ribbon.springcloudeurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yy
 * @ProjectName spring-cloud
 * @Description: TODO
 * @date 2018/11/6 12:00
 */
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc(){
        return restTemplate.getForObject("http://eureka-client/dc",String.class);
    }

}
