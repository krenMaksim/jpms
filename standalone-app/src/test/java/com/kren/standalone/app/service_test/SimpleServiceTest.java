package com.kren.standalone.app.service_test;

import com.kren.standalone.app.service.SimpleService;
import com.kren.standalone.app.spring.AppConfig;
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
