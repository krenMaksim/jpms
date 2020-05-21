package com.kren.standalone.surefire.plugin.app.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    public void doSomething() {
        System.out.println("do something");
    }
}
