package com.waleed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class BookInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInfoServiceApplication.class, args);
	}
	
	@Bean
	RestTemplate getRestTemplate(){
		return new RestTemplate();
}
	
}
