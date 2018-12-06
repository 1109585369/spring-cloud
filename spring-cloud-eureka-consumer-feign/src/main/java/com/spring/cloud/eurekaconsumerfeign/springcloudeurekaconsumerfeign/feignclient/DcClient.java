package com.spring.cloud.eurekaconsumerfeign.springcloudeurekaconsumerfeign.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yy
 * @ProjectName spring-cloud
 * @Description: TODO
 * @date 2018/11/711:27
 */

@FeignClient(name = "eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
