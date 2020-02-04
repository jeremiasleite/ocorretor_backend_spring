package com.jeremiasleite.ocorretor.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jeremiasleite.ocorretor.domain.Imovel;

@RestController
@RequestMapping(value="/imoveis")
public class ImovelResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Imovel> listar() {
		
		Imovel imovel1 = new Imovel(1, "Imovel1", "Este é o imovel 1");
		Imovel imovel2 = new Imovel(2, "Imovel2", "Este é o imovel 2");
		List<Imovel> lista = new ArrayList<>();
		lista.add(imovel1);
		lista.add(imovel2);		
		
		return lista;
	}
}
