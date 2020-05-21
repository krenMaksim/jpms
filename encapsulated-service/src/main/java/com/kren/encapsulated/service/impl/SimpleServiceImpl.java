package com.kren.encapsulated.service.impl;

import com.kren.encapsulated.service.SimpleService;
import org.springframework.stereotype.Service;

@Service("simpleService")
public class SimpleServiceImpl implements SimpleService {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }
}
