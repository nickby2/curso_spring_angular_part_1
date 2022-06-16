package com.aplicacao.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacao.cursomc.domain.Categoria;
import com.aplicacao.cursomc.repositories.CategoriaRepository;
import com.aplicacao.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + ", Tipo: " + Categoria.class.getName()));
		// Exceção da classe ObjectNotFoundException
	}

}
