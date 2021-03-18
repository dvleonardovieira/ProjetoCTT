package com.projetopraticoctt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.projetopraticoctt")
public class ProjetoPrativcoCttApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPrativcoCttApplication.class, args);
	}

}
