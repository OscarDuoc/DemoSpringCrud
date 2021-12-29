package com.acl.servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.acl.model.Persona;
import com.acl.Repositorio.PersonaRepositorio;

@Service
public class ServicioPersona implements PersonaRepositorio {
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	public Persona create (Persona persona) {
		return personaRepositorio.save(persona);
	}
	
	public List<Persona> getAllPersonas (){
		return (List<Persona>) personaRepositorio.findAll();
	}
	
	public void delete (Persona persona) {
		personaRepositorio.delete(persona);
	}
	
	public Optional<Persona> findById (Long id) {
		return personaRepositorio.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		personaRepositorio.deleteById(id);
	}
	
	public Persona updatePersona (Persona persona) {
		return personaRepositorio.save(persona);

	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Persona> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
		return null;
	}

	









	
}
