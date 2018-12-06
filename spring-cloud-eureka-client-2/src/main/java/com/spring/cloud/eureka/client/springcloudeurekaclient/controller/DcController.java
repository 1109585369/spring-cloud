package com.spring.cloud.eureka.client.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy
 * @ProjectName spring-cloud
 * @Description: TODO
 * @date 2018/11/6 11:34
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String dc(){
        String services = "service:" + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
