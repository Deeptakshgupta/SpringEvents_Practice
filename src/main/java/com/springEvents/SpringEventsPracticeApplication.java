package com.springEvents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringEventsPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsPracticeApplication.class, args);
	}

}
