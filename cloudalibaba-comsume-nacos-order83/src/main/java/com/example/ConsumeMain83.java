package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: jqq
 * @time: 2021/5/6 17:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumeMain83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumeMain83.class, args);
    }
}
