package com.leonardo.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leonardo.crud.model.ClienteModel;
/**
 * Repositorio de cliente.
 * @author Leonardo Rodrigues
 */
public interface ClienteRepository extends CrudRepository<ClienteModel, Integer> {
	
	List<ClienteModel> findAll();
	
	ClienteModel findByCodigoCliente (Integer codigoCliente);
	
	ClienteModel findByCodigoTelefone (Integer codigoTelefone);
	
	void delete(ClienteModel cliente);

	<CliMod extends ClienteModel> CliMod save(CliMod cliente); 

}
