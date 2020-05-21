package com.kren.standalone.surefire.plugin.app;

import com.kren.standalone.surefire.plugin.app.service.SimpleService;
import com.kren.standalone.surefire.plugin.app.spring.AppConfig;
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
