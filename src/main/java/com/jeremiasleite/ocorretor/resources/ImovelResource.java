package com.jeremiasleite.ocorretor.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jeremiasleite.ocorretor.domain.Imovel;
import com.jeremiasleite.ocorretor.services.ImovelService;

@RestController
@RequestMapping(value="/imoveis")
public class ImovelResource {
	
	@Autowired
	private ImovelService service;
	
	@GetMapping(value="/ola")
	public String Ola() {
		return "oi";
	}
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Imovel imovel = service.find(id);		
		return ResponseEntity.ok().body(imovel);
	}
	
	
}
