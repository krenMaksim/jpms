package com.kren.encapsulated.service.impl;

import com.kren.encapsulated.service.SimpleService;
import com.kren.encapsulated.service.spring.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
public class SimpleServiceImplTest {
    @Autowired
    private SimpleService simpleService;

    @Test
    public void doSomething() {
        simpleService.doSomething();
    }
}
