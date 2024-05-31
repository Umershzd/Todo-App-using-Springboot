package com.springbootApp.myFirstSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Hp
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.springbootApp.myFirstSpringBootApp"})
public class  MyFirstSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringBootAppApplication.class, args);
	}

}
