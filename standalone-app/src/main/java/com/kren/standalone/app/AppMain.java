package com.kren.standalone.app;

import com.kren.standalone.app.service.SimpleService;
import com.kren.standalone.app.spring.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleService ss = context.getBean(SimpleService.class);
        ss.doSomething();
    }
}
