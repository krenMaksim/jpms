package com.kren.jpms.app.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.kren.jpms.service.spring.ServiceConfig;

@Configuration
@Import(ServiceConfig.class)
public class AppConfig {
}
