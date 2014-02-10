package com.hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.hello.controller", "com.hello.config" })
public class AppConfig {

}
