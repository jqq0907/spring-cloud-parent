package com.example.service.impl;

import com.example.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: jqq
 * @time: 2021/4/21 15:40
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getString() {
        return "openFeign";
    }
}
