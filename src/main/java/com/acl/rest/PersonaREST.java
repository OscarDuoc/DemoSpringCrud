package com.acl.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acl.model.Persona;
import com.acl.servicios.ServicioPersona;

@RestController
@RequestMapping ("/api/persona/")
public class PersonaREST {

	@Autowired
	private ServicioPersona personaService;
	
	@PostMapping  
	private ResponseEntity<Persona> guardar (@RequestBody Persona persona){
		Persona prueba = personaService.create(persona);
		
		try {
			return ResponseEntity.created(new URI("/api/persona"+prueba.getId())).body(prueba);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas (){
		return ResponseEntity.ok(personaService.getAllPersonas());
	}
	
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
		System.out.println(id);
		personaService.deleteById(id);
		System.out.println(id);
		return ResponseEntity.ok(!(personaService.findById(id)!=null));
		
	}
	
	@PutMapping("modificar")
	private ResponseEntity<Persona> actualizar (@RequestBody Persona persona){
		personaService.updatePersona(persona);
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	  	
	}
	
	
	
	//@RequestMapping (value = "/{id}", method = RequestMethod.GET )
	//private ResponseEntity<Optional<Persona>> listarPorId (@PathVariable ("id") Long id){
	//	return ResponseEntity.ok(personaService.findById(id));
		
	//}
	
	
	
}
