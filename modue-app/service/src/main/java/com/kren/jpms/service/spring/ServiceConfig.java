package com.kren.jpms.service.spring;

import com.kren.jpms.service.impl.BussinesLogicServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BussinesLogicServiceImpl.class})
public class ServiceConfig {

}
