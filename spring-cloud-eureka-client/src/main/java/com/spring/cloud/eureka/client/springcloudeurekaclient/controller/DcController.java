package com.spring.cloud.eureka.client.springcloudeurekaclient.controller;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author yy
 * @ProjectName spring-cloud
 * @Description: TODO
 * @date 2018/11/6 11:34
 */
@RestController
public class DcController {

    @Autowired
    Registration registration;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String dc(){
        AtomicReference<String> services = null;

        discoveryClient.getServices().forEach(id -> {
            discoveryClient.getInstances(id).forEach(instance -> {
                services.set("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
            });
        });
        return services.get();
    }

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: yy
     * @Date: 2018/11/9 15:11
     */
    public void mehtod(){}
}
