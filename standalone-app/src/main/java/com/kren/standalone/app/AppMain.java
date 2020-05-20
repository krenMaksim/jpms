package com.kren.standalone.app;

import com.kren.standalone.app.service.SimpleService;
import com.kren.standalone.app.spring.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SimpleService ss = ctx.getBean(SimpleService.class);
        ss.doSomething();

        ctx.close();
    }
}
