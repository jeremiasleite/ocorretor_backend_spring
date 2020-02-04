package com.jeremiasleite.ocorretor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeremiasleite.ocorretor.domain.Imovel;
import com.jeremiasleite.ocorretor.repositories.ImovelRepository;

@Service
public class ImovelService {
	
	@Autowired
	private ImovelRepository imovelRepository;

	public Imovel find(Integer id) {
		Optional<Imovel> obj = imovelRepository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Imovel> findAll(){
		List<Imovel> obj = imovelRepository.findAll();
		return obj;
	}
}
