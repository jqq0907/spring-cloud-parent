package com.example.controller;

import com.example.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: jqq
 * @time: 2021/4/14 13:47
 */
@Slf4j
@RestController
public class DemoController {
    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private DemoService demoService;

    @RequestMapping("/payment/select")
    public String getDemo() {
        return "我是提供者";
    }

    @RequestMapping("/payment/distance")
    public Object distance() {
        //服务发现
        List<String> services = discoveryClient.getServices();
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        return instances;
    }

    /**
     * openFeign调用
     *
     * @return
     */
    @RequestMapping("/payment/openfeign/string")
    public String getString() {
        return demoService.getString();
    }
}
