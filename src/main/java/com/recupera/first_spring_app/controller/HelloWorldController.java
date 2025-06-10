package com.recupera.first_spring_app.controller;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recupera.first_spring_app.domain.User;
import com.recupera.first_spring_app.services.HelloWorldService;

// recebe a aquisição


@RestController // combina duas anotações / permite receber uma página web => não é oque eu to fazendo
//STATELESS -> token, valida com mais processos, diferente do STATEFULL que não precisa (o estado do cliente é mantido n servidor)
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	// O Spring coloca automaticamente a dependência, facilitando a atualizações e a manutenção do código.
	@Autowired 
	private HelloWorldService  helloWorldService;

	 // Construtor para injeção do serviço
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
	
	
	@GetMapping // esse metodo vai responder  ao /hello-world
	public String helloworld() {
		// Chamando o método do serviço e passando o nome
        return helloWorldService.helloworld( "kipper");
        
       
	}
	
	/**
	 * Endpoint POST que recebe um ID pela URL, um parâmetro "filter" pela query string
	 * e um objeto User no corpo da requisição.
	 *
	 * @param id ID recebido como parte da URL
	 * @param filter parâmetro opcional com valor padrão "sla"
	 * @param body objeto User enviado no corpo da requisição
	 * @return mensagem com o nome do usuário recebido
	 */

	
	@PostMapping("/{id}")
	public String helloworldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "sla") String filter, @RequestBody User body) {
		return "Hello World Post" + body.getName();
		}
}
