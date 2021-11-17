package com.projeto.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entregas")
public class Entrega implements Serializable {

	private static final long serialVersionUID = -2458129009799710655L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entrega_id")
	private Long id;
	
	@Column(name = "data_saida")
	private Date dataSaida;
	
	@Column(name = "data_entrega")
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
