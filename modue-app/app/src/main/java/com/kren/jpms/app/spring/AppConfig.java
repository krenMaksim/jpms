package com.kren.jpms.app.spring;

import com.kren.jpms.service.spring.ServiceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceConfig.class)
public class AppConfig {
}
