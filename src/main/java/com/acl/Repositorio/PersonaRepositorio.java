package com.acl.Repositorio;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.acl.model.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

	List<Persona> findAll(Sort sort);

	void flush();

	void deleteAllInBatch(Iterable<Persona> entities);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteAllInBatch();

	Persona getOne(Long id);

	Persona getById(Long id);

	Page<Persona> findAll(Pageable pageable);
	
	

}
