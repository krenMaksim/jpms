package com.kren.jpms.service.impl;

import org.springframework.stereotype.Service;

import com.kren.jpms.service.BussinesLogicService;
import com.kren.jpms.service.util.SimpleUtil;

@Service("bussinesLogicService")
public class BussinesLogicServiceImpl implements BussinesLogicService {

    public void doSomething() {
        System.out.println(SimpleUtil.doSomething());
    }
}
