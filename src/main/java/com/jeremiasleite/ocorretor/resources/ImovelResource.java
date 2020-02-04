package com.jeremiasleite.ocorretor.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/imoveis")
public class ImovelResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest Funcionando";
	}
}
