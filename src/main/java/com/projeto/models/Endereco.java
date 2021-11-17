package com.projeto.models;

import java.io.Serializable;

public class Endereco implements Serializable {
	
	private static final long serialVersionUID = -6320893457953319910L;

	private Long id;
	
	private String cep;
	
//	Construtores
	public Endereco() {
	}

	public Endereco(String cep) {
		super();
		this.cep = cep;
	}

//	Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
