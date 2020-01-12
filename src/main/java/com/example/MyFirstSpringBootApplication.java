package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.board"})
public class MyFirstSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("asdasdasdasdasd");
		SpringApplication application =  new SpringApplication(MyFirstSpringBootApplication.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		//application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
