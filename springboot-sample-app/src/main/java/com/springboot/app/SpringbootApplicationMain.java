package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.springboot.app")
@SpringBootApplication
public class SpringbootApplicationMain {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApplicationMain.class, args);
	}

}