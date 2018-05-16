package com.ledavijeans.demo;

import com.ledavijeans.demo.repository.CustomerRepository;
import com.ledavijeans.demo.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LedavijeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LedavijeansApplication.class, args);
		ApplicationContext springContext = SpringApplication.run(LedavijeansApplication.class, args);
		CustomerRepository customer = springContext.getBean(CustomerRepository.class);
		ProductRepository product = springContext.getBean(ProductRepository.class);


	}
}
