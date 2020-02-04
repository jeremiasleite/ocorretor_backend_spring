package com.jeremiasleite.ocorretor.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {
	
	@RequestMapping()
	public String ola(){
		return "Olá eu sou o usuário";
	}
}
