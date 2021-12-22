package com.leonardo.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe que representa os Telefones na aplicação.
 * @author Leonardo Rodrigues
 */

@Entity
@Table(name="telefone")
public class TelefoneModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_telefone")
	private Integer codigoTelefone;
	
	@Column(name="numero_telefone")
	private String numeroTelefone;

	@Column(name="descricao_telefone")
	private String descricaoTelefone;
		
	@Column(name="codigo_cliente")
	private Integer codigoCliente;

	@Column(name="nome_cliente")
	private String nomeCliente;

	public TelefoneModel(Integer codigoTelefone, String numeroTelefone, String descricaoTelefone, Integer codigoCliente,
			String nomeCliente) {
		super();
		this.codigoTelefone = codigoTelefone;
		this.numeroTelefone = numeroTelefone;
		this.descricaoTelefone = descricaoTelefone;
		this.codigoCliente = codigoCliente;
		this.nomeCliente = nomeCliente;
	}

	public Integer getCodigoTelefone() {
		return codigoTelefone;
	}

	public void setCodigoTelefone(Integer codigoTelefone) {
		this.codigoTelefone = codigoTelefone;
	}

	public String getDescricaoTelefone() {
		return descricaoTelefone;
	}

	public void setDescricaoTelefone(String descricaoTelefone) {
		this.descricaoTelefone = descricaoTelefone;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	public TelefoneModel() {
		
	}
	
}
