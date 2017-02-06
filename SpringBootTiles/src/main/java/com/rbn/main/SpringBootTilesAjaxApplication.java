package com.rbn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rbn")
public class SpringBootTilesAjaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTilesAjaxApplication.class, args);
	}

}