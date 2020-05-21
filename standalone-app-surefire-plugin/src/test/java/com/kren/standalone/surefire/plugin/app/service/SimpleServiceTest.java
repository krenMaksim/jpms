package com.kren.standalone.surefire.plugin.app.service;

import com.kren.standalone.surefire.plugin.app.spring.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
public class SimpleServiceTest {
    @Autowired
    private SimpleService simpleService;

    @Test
    public void doSomething() {
        simpleService.doSomething();
    }
}
