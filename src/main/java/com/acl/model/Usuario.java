package com.acl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	private int id;
	private String email;
	private String clave;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
