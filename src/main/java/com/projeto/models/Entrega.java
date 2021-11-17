package com.projeto.models;

import java.io.Serializable;
import java.util.Date;

public class Entrega implements Serializable {

	private static final long serialVersionUID = -2458129009799710655L;
	
	private Long id;
	
	private Date dataSaida;
	
	private Date dataEntrega;
	
//	Construtores
	public Entrega() {
	}

	public Entrega(Date dataSaida, Date dataEntrega) {
		super();
		this.dataSaida = dataSaida;
		this.dataEntrega = dataEntrega;
	}

//	Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
