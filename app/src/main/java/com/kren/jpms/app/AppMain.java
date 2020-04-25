package com.kren.jpms.app;

import com.kren.jpms.app.spring.AppConfig;
import com.kren.jpms.service.BussinesLogicService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BussinesLogicService bls = context.getBean(BussinesLogicService.class);
        bls.doSomething();
    }
}
