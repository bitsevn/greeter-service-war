package com.bitsevn.azure.app.service.greeter.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class GreeterServiceWarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("[greeter] [service] App is starting..");
		SpringApplication.run(GreeterServiceWarApplication.class, args);
		System.out.println("[greeter] [service] App is started.");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GreeterServiceWarApplication.class);
	}

}
