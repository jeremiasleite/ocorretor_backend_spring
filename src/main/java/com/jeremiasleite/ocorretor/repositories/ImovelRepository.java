package com.jeremiasleite.ocorretor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeremiasleite.ocorretor.domain.Imovel;


public interface ImovelRepository extends JpaRepository<Imovel, Integer>{

}
