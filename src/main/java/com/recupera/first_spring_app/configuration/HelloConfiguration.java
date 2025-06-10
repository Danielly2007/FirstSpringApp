package com.recupera.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Indica que esta classe é uma configuração do Spring, responsável por criar beans
public class HelloConfiguration {

	@Bean // Declara um bean gerenciado pelo Spring chamado 'sdkAWS'
	public String helloWorld() { //exemplo
		return "Hello World"; // Cria e retorna uma nova instância da classe SDKAWS
	}
	
}
