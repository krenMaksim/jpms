package com.kren.jpms.service.impl;

import com.kren.jpms.service.BussinesLogicService;
import com.kren.jpms.service.spring.ServiceConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ServiceConfig.class)
// @ExtendWith(SpringExtension.class)
// @ContextConfiguration(classes = {ServiceConfig.class})
public class BussinesLogicServiceImplTest {
    // https://sormuras.github.io/blog/2018-09-11-testing-in-the-modular-world.html
    // https://github.com/junit-team/junit5-samples/tree/master/junit5-modular-world

    // https://github.com/qutax/jpms-spring-example

    // try to add module as well

    @Autowired
    private BussinesLogicService bussinesLogicService;

    @Test
    public void doSomething() {
        bussinesLogicService.doSomething();
    }
}
