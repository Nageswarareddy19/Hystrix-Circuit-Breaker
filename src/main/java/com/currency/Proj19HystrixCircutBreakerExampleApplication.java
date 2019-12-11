package com.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableCircuitBreaker
public class Proj19HystrixCircutBreakerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj19HystrixCircutBreakerExampleApplication.class, args);
	}

}
