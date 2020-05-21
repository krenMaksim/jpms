package com.kren.jpms.service.impl_test;

import com.kren.jpms.service.BussinesLogicService;
import com.kren.jpms.service.spring.ServiceConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ServiceConfig.class)
public class BussinesLogicServiceImplTest {
    @Autowired
    private BussinesLogicService bussinesLogicService;

    @Test
    public void doSomething() {
        bussinesLogicService.doSomething();
    }
}
