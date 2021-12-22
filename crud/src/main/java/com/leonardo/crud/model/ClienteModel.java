package com.leonardo.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

/**
 * Classe que representa os Telefones na aplicação.
 * @author Leonardo Rodrigues
 */

@Entity
@NoArgsConstructor
@Table(name="cliente")
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_cliente")
	private Integer codigoCliente;
	
	@Column(name="nome_cliente")
	private String nomeCliente;
	
	@Column(name="endereco_cliente")
	private String enderecoCliente;
	
	public ClienteModel(Integer codigoCliente, String nomeCliente, String enderecoCliente, String bairroCliente,
			Integer codigoTelefone, String numeroTelefone) {
		super();
		this.codigoCliente = codigoCliente;
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.bairroCliente = bairroCliente;
		this.codigoTelefone = codigoTelefone;
		this.numeroTelefone = numeroTelefone;
	}
	@Column(name="bairro_cliente")
	private String bairroCliente; 
	
	@Column(name="codigo_telefone")
	private Integer codigoTelefone;
	
	@Column(name="numero_telefone")
	private String numeroTelefone;
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
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
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public Integer getCodigoTelefone() {
		return codigoTelefone;
	}
	public void setCodigoTelefone(Integer codigoTelefone) {
		this.codigoTelefone = codigoTelefone;
	}
	
	public ClienteModel() {
		
	}
}
