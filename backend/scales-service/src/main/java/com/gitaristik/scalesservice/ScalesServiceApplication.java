package com.gitaristik.scalesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScalesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScalesServiceApplication.class, args);
	}

}
