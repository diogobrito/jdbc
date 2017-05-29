package br.com.fiap.dao;

import br.com.fiap.entity.Cliente;

public interface ClientesDao {
	void inserirCliente(Cliente cliente) throws Exception;

	Cliente buscarCliente(int id) throws Exception;
}