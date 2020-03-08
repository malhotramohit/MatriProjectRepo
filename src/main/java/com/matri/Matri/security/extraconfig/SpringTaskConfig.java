package com.matri.Matri.security.extraconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan({ "com.matri.Matri.security" })
public class SpringTaskConfig {

}
