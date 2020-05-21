package com.kren.standalone.surefire.plugin.app.spring;

import com.kren.standalone.surefire.plugin.app.service.SimpleService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SimpleService.class})
public class AppConfig {

}
