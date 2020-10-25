package com.example.consumingProjet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingProjetApplication {
	
	private static final Logger log =  LoggerFactory.getLogger(ConsumingProjetApplication.class); 
	
	@Bean	
	public RestTemplate restTemplate (RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	public CommandLineRunner run (RestTemplate restTemplate) {
		Citation c = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Citation.class);

		return args -> {
			log.info(c.toString());
		};
	}


	public static void main(String[] args) {
		SpringApplication.run(ConsumingProjetApplication.class, args);
	}


}
