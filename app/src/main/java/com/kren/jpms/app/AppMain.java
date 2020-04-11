package com.kren.jpms.app;

import com.kren.jpms.service.api.BussinesLogicService;

class AppMain {

    public static void main(String[] args) {
        BussinesLogicService bls = new BussinesLogicService();
        bls.doSomething();
    }
}
