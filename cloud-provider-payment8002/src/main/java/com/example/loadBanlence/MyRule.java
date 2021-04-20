package com.example.loadBanlence;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 随机算法
 * @author: jqq
 * @time: 2021/4/14 17:56
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getIrule() {
        return new RandomRule();
    }
}
