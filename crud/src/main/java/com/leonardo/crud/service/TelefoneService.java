package com.leonardo.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.crud.model.TelefoneModel;
import com.leonardo.crud.model.ResponseModel;
import com.leonardo.crud.repository.TelefoneRepository;

/**
 * Serviço de telefones.
 * @author Leonardo Rodrigues
 */

@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository repository;
	
	/**
	 * Serviço de cadastro - adiciona o telefone atraves do codigo de registro.
	 *  Retorna sucesso ou falha.
	 */
	public ResponseModel cadastrar( TelefoneModel Telefone) {
		ResponseModel resposta = new ResponseModel();
		try {
				Telefone.setCodigoTelefone(null);		
				repository.save(Telefone);
				resposta.setMensagem("Telefone cadastrado com sucesso");
				resposta.setCodigo(1);
		} catch (Exception e) {
			resposta.setMensagem("Falha ao cadastrar: "+e.getMessage());
			resposta.setCodigo(99);
		}
		return resposta;
	}
	
	/**
	 * Serviço de remoção - remove o telefone atraves do codigo de registro.
	 *  Retorna sucesso ou falha.
	 */
	public ResponseModel remover(Integer codigoTelefone) {		
		ResponseModel resposta = new ResponseModel();
		try {			
			TelefoneModel Telefone = repository.findByCodigoTelefone(codigoTelefone);
			this.repository.delete(Telefone);
			resposta.setMensagem("Telefone removido com sucesso");
			resposta.setCodigo(1);
		} catch (Exception e) {
			resposta.setMensagem("Falha ao remover: "+e.getMessage());
			resposta.setCodigo(99);
		}
		return resposta;
	}
	/**
	 * Serviço de busca - retorna uma lista com todos os registros de telefone.
	 *
	 */
	 public List<TelefoneModel> findAll() throws Exception {
		    return repository.findAll();
		  }

}
