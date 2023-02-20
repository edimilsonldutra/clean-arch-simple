package com.github.edimilsonldutra.cleanarchsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CleanArchSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanArchSimpleApplication.class, args);
	}

}
