package com.leonardo.crud.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.crud.model.ClienteModel;
import com.leonardo.crud.model.ResponseModel;
import com.leonardo.crud.model.TelefoneModel;
import com.leonardo.crud.repository.ClienteRepository;
import com.leonardo.crud.repository.TelefoneRepository;

/**
 * Serviço de clientes.
 * @author Leonardo Rodrigues
 */

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository cliRepository;

	@Autowired
	private TelefoneRepository telRepository;
	
	/**
	 * Serviço de cadastro - verifica se o telefone informado não é nulo,
	 * se o telefone não existe ou se o telefone está relacionado a outro cliente,
	 * depois realiza o cadastro. Retorna com sucesso, 
	 * ou se as condições estiverem erradas com falha.
	 *  
	 */
	
	public ResponseModel cadastrar( ClienteModel cliente) {
		ResponseModel resposta = new ResponseModel();
		try {
			if((cliente.getCodigoTelefone()!=null) && (cliente.getCodigoTelefone()!=0)) {
				
				ClienteModel listClienteTelefone = cliRepository.findByCodigoTelefone(cliente.getCodigoTelefone());
				
				boolean find = false;
				
				if(listClienteTelefone != null) {
					find = false;
				} else {
					find = true;
				}
				
				if(find == true) {
				
					TelefoneModel listTelefone = telRepository.findByCodigoTelefone(cliente.getCodigoTelefone());
				
					if(listTelefone!=null) {
						listTelefone.setNomeCliente(cliente.getNomeCliente()); 
						listTelefone.setDescricaoTelefone(cliente.getNomeCliente()); 
						
						
						cliente.setNumeroTelefone(listTelefone.getNumeroTelefone());
						cliente.setCodigoCliente(null);		
						cliRepository.save(cliente);
						
						resposta.setMensagem("Cliente cadastrado com sucesso");
						resposta.setCodigo(1);
					} else {
						resposta.setMensagem("Telefone não encontrado!");
						resposta.setCodigo(99);
					}
				} else {
					resposta.setMensagem("Telefone relacionado a outro cliente!");
					resposta.setCodigo(99);
				}
			} else {
				resposta.setMensagem("O Telefone não pode ser nulo! Selecione!"); 
				resposta.setCodigo(99);
			}
		} catch (Exception e) {
			resposta.setMensagem("Falha ao cadastrar: "+e.getMessage());
			resposta.setCodigo(99);
		}
		return resposta;
	}
	
	/**
	 * Serviço de remoção - remove o cliente atraves do codigo de registro,
	 * e limpa o cadastro de telefone relacionado com o cliente.
	 *  Retorna sucesso ou falha.
	 */
	public ResponseModel remover(Integer codigoCliente) {		
		ResponseModel resposta = new ResponseModel();
		try {	
			ClienteModel cliente = cliRepository.findByCodigoCliente(codigoCliente);
			
			if(cliente != null) {
			TelefoneModel telefone = telRepository.findByNumeroTelefone(cliente.getNumeroTelefone());
			
			if(telefone != null) {
			telefone.setCodigoCliente(null);
			telefone.setNomeCliente(null);
			telefone.setDescricaoTelefone(null);
			telRepository.save(telefone);
			
			this.cliRepository.delete(cliente);
			resposta.setMensagem("Cliente removido com sucesso");
			resposta.setCodigo(1);
			} else {
				this.cliRepository.delete(cliente);
				resposta.setMensagem("Cliente removido com sucesso");
				resposta.setCodigo(1);
			}
			} else {
				resposta.setMensagem("Código do cliente inválido");
				resposta.setCodigo(99);
			}
			
		} catch (Exception e) {
			resposta.setMensagem("Falha ao remover: "+e.getMessage());
			resposta.setCodigo(99);
		}
		return resposta;
	}
	/**
	 * Serviço de busca - retorna uma lista com todos os registros de cliente.
	 *
	 */
	 public List<ClienteModel> findAll() throws Exception {
		    return cliRepository.findAll();
		  }

}
