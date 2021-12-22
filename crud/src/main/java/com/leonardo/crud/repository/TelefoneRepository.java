package com.leonardo.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leonardo.crud.model.TelefoneModel;

/**
 * Repositorio de telefone.
 * @author Leonardo Rodrigues
 */
public interface TelefoneRepository extends CrudRepository<TelefoneModel, Integer> {
	
	List<TelefoneModel> findAll();
	
	TelefoneModel findByCodigoTelefone (int codigoTelefone);
	
	void delete(TelefoneModel cliente);

	<TelMod extends TelefoneModel> TelMod save(TelMod cliente); 
	
	TelefoneModel findByNumeroTelefone (String numeroTelefone);

}
