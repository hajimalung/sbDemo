package com.hajimalung.SpringbootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);
		System.out.println("Hello World!");

		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
