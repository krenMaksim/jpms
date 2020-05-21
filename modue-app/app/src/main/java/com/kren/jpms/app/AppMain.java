package com.kren.jpms.app;

import com.kren.jpms.app.spring.AppConfig;
import com.kren.jpms.service.BussinesLogicService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        BussinesLogicService bls = ctx.getBean(BussinesLogicService.class);
        bls.doSomething();

        ctx.close();
    }
}
