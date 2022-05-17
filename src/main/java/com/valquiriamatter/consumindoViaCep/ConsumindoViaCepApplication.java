package com.valquiriamatter.consumindoViaCep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsumindoViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumindoViaCepApplication.class, args);
	}

}
