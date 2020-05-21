package com.kren.encapsulated.service.spring;

import com.kren.encapsulated.service.impl.SimpleServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SimpleServiceImpl.class})
public class AppConfig {

}
