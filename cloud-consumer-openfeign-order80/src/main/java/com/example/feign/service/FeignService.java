package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: openFeign接口
 * @author: jqq
 * @time: 2021/4/21 15:37
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface FeignService {
    @RequestMapping("/payment/openfeign/string")
    String getString();
}
