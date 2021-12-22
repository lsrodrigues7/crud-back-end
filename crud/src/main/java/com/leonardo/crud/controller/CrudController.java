package com.leonardo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.crud.model.ClienteModel;
import com.leonardo.crud.model.ResponseModel;
import com.leonardo.crud.model.TelefoneModel;
import com.leonardo.crud.service.ClienteService;
import com.leonardo.crud.service.TelefoneService;

/**
 * Controller que contem as chamadas dos serviços.
 * @author Leonardo Rodrigues
 */

@RestController
@RequestMapping("/api")
public class CrudController {
		
	@Autowired
	private ClienteService cliService;
	
	@Autowired
	private TelefoneService telService;
	
	//clientes
	@RequestMapping(value="/clientes", method=RequestMethod.GET)
	public @ResponseBody List<ClienteModel> listar() throws Exception {
		return cliService.findAll();
	}
		
	@RequestMapping(value="/cadastrar/cliente", method=RequestMethod.POST)
	public @ResponseBody ResponseModel cadastrar(@RequestBody ClienteModel cliente) throws Exception {
		return cliService.cadastrar(cliente);
	}
	
	@RequestMapping(value="/remover/{codigoCliente}", method=RequestMethod.DELETE)
	public @ResponseBody ResponseModel remover(@PathVariable Integer codigoCliente) {
		return cliService.remover(codigoCliente);
	}

	//telefones
	@RequestMapping(value="/telefones", method=RequestMethod.GET)
	public @ResponseBody List<TelefoneModel> listarTel() throws Exception {
		return telService.findAll();
	}
	
	@RequestMapping(value="/cadastrarTel/telefone", method=RequestMethod.POST)
	public @ResponseBody ResponseModel cadastrarTel(@RequestBody TelefoneModel tel) throws Exception {
		return telService.cadastrar(tel);
	}
	
	@RequestMapping(value="/removerTel/{codigoTelefone}", method=RequestMethod.DELETE)
	public @ResponseBody ResponseModel removerTel(@PathVariable Integer codigoTelefone) {
		return telService.remover(codigoTelefone);
	}

}
