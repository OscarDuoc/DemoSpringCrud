package com.acl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
	
	@Entity
	@Table (name = "users")
	@EntityListeners(AuditingEntityListener.class)
	public class Persona {
		
		 @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private long id;

		    @Column(name = "Nombre", nullable = false)
		    private String Nombre;

		    @Column(name = "Apellido", nullable = false)
		    private String Apellido;

		    @Column(name = "Correo", nullable = false)
		    private String Correo;
		
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre = Nombre;
		}
		public String getApellido() {
			return Apellido;
		}
		public void setApellido(String Apellido) {
			this.Apellido = Apellido;
		}
		public String getCorreo() {
			return Correo;
		}
		public void setCorreo(String Correo) {
			this.Correo = Correo;
		}
		
		 @Override
		    public String toString() {
		        return "User{" +
		                "id=" + id +
		                ", Nombre='" + Nombre + '\'' +
		                ", Apellido='" + Apellido + '\'' +
		                ", Correo='" + Correo + '\'' +

		                '}';
		    }

}
