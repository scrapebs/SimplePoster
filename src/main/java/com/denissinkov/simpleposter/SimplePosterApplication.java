package com.denissinkov.simpleposter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplePosterApplication {

	private static final Logger log = LoggerFactory.getLogger(SimplePosterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SimplePosterApplication.class, args);
	}

}
