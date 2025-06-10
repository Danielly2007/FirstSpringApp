package com.recupera.first_spring_app.services;

import org.springframework.stereotype.Service;

//controller tranfere para cá para fazer o trabalho pesado, lógico

@Service // Anotação para tornar essa classe um Bean gerenciado pelo Spring
public class HelloWorldService {

	// Método que recebe o nome e retorna uma saudação
	public String helloworld(String name) {
		return "Hello World! " + name;
		
		
	}
}
