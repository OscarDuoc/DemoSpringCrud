package com.acl;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.acl.Repositorio.UsuarioRepositorio;
import com.acl.model.Usuario;


@RunWith(SpringRunner.class)
@SpringBootTest
class DemoCrudPostgresApplicationTests {
	
	@Autowired
	private UsuarioRepositorio repo;
	
	
	@Test
	public void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(1);
		us.setEmail("os.po@gmail.com");
		us.setClave("123");
		
		Usuario retorno = repo.save(null);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}


}
