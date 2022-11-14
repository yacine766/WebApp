package com.example.proyectweb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Proyectweb1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyectweb1Application.class, args);
	}

}
