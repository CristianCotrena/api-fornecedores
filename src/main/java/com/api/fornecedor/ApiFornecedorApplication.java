package com.api.fornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiFornecedorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFornecedorApplication.class, args);
	}
@GetMapping("/")
	public String olaMundo(){
		return "Ola Mundo";
}
}
