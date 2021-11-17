package com.projeto.models;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private static final long serialVersionUID = 8941790098215483580L;

	private Long id;
	
	private String nome;
	
	private double preco;
	
	private String descricao;
	
//	Construtores
	public Produto() {
	}

	public Produto(String nome, double preco, String descricao) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

//	Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
