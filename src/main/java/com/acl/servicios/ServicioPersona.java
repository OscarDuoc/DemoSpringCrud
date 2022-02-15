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

	public Persona updatePersona (Persona persona) {
		return personaRepositorio.save(persona);

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		personaRepositorio.deleteById(id);
	}















	@Override
	public void deleteAllById(Iterable<? extends Long> longs) {


	}

	@Override
	public void deleteAll(Iterable<? extends Persona> entities) {

	}

	@Override
	public void deleteAll() {

	}

	public Optional<Persona> findById (Long id) {
		return personaRepositorio.findById(id);
	}

	@Override
	public boolean existsById(Long aLong) {
		return false;
	}


	@Override
	public List<Persona> findAll() {
		return personaRepositorio.findAll();
	}

	public List<Persona> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {

	}

	@Override
	public <S extends Persona> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Persona> entities) {

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {

	}

	@Override
	public void deleteAllInBatch() {

	}

	@Override
	public Persona getOne(Long id) {
		return null;
	}

	@Override
	public Persona getById(Long id) {
		return personaRepositorio.getById(id);
	}

	@Override
	public <S extends Persona> Optional<S> findOne(Example<S> example) {
		return Optional.empty();
	}

	@Override
	public <S extends Persona> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Persona> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Persona> boolean exists(Example<S> example) {
		return false;
	}

	@Override
	public <S extends Persona, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return null;
	}

	@Override
	public Page<Persona> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public List<Persona> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public <S extends Persona> S save(S entity) {
		return null;
	}

	@Override
	public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
		return null;
	}


}
