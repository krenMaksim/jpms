package com.kren.encapsulated.service.app;

import com.kren.encapsulated.service.impl.SimpleServiceImpl;
import com.kren.encapsulated.service.spring.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SimpleServiceImpl ss = ctx.getBean(SimpleServiceImpl.class);
        ss.doSomething();

        ctx.close();
    }
}
