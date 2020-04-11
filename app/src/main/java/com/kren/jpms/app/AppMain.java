package com.kren.jpms.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kren.jpms.app.spring.AppConfig;
import com.kren.jpms.service.BussinesLogicService;

class AppMain {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BussinesLogicService bls = context.getBean(BussinesLogicService.class);
        bls.doSomething();
    }
}
