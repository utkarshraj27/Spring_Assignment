package com.cg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cg")
@PropertySource("classpath:employees.properties")

public class JavaConfig {

}
