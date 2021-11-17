package com.projeto.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Venda implements Serializable {

	private static final long serialVersionUID = 7892320012192777937L;
	
	private Long id;
	
	private List<Produto> produtos;
	
	private Cliente cliente;
	
	private Date dataVenda;
	
	private Entrega entrega;
	
//	Construtores
	public Venda() {
	}

	public Venda(List<Produto> produtos, Cliente cliente, Date dataVenda, Entrega entrega) {
		super();
		this.produtos = produtos;
		this.cliente = cliente;
		this.dataVenda = dataVenda;
		this.entrega = entrega;
	}

//	Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
