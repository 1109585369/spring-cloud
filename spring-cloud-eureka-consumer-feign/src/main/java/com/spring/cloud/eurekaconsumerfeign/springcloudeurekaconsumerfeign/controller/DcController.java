package com.spring.cloud.eurekaconsumerfeign.springcloudeurekaconsumerfeign.controller;

import com.spring.cloud.eurekaconsumerfeign.springcloudeurekaconsumerfeign.feignclient.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy
 * @ProjectName spring-cloud
 * @Description: TODO
 * @date 2018/11/7 11:29
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc(){
        return dcClient.consumer();
    }


}
