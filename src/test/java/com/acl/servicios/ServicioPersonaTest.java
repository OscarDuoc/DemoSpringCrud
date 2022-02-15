package com.acl.servicios;

import com.acl.Repositorio.PersonaRepositorio;
import com.acl.model.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.Arrays;
import java.util.NoSuchElementException;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class ServicioPersonaTest {

    @Mock
    private PersonaRepositorio personaRepositorio;

    @InjectMocks
    private ServicioPersona servicioPersona;

    private Persona persona;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        persona = new Persona();
        persona.setNombre("Oscar Andres");
        persona.setApellido("Poblete Quezada");
        persona.setCorreo("o.pbleteq@gmail.cl");
        persona.setId(10L);

   }

    @Test
    void create() {

        when(personaRepositorio.save(any(Persona.class))).thenReturn(persona);
        assertNotNull(servicioPersona.create(new Persona()));
        System.out.println(servicioPersona.create(persona));

    }

    @Test
    void getAllPersonas() {

        when(personaRepositorio.findAll()).thenReturn(Arrays.asList(persona));
        assertNotNull(servicioPersona.getAllPersonas());
        System.out.println(servicioPersona.getAllPersonas());

    }

    @Test
    void updatePersona() {

        when(personaRepositorio.save(any(Persona.class))).thenReturn(persona);
        assertNotNull(servicioPersona.create(new Persona()));
        System.out.println(servicioPersona.create(persona));

        persona.setNombre("Raul Andres");
        persona.setCorreo("raulMa@gmail.cl");
        persona.setId(19L);

        when(personaRepositorio.save(any(Persona.class))).thenReturn(persona);
        assertNotNull(servicioPersona.updatePersona(new Persona()));
        System.out.println(servicioPersona.updatePersona(persona));

    }
}


    //@Test
    //void delete() {

//        when(personaRepositorio.save(any(Persona.class))).thenReturn(persona);
//        assertNotNull(servicioPersona.create(new Persona()));
//        System.out.println(servicioPersona.create(persona));

//        System.out.println("-----");
//        when(personaRepositorio.findById(10L).orElseThrow());
//        assertEquals("Oscar Andres", persona.getNombre());
//        servicioPersona.delete(persona);
//        System.out.println(persona);

//        assertThrows(NoSuchElementException.class, () -> {
//                    personaRepositorio.findById(persona.getId()).orElseThrow();
//                });

//    }

//}