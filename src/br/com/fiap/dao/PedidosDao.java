package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Pedido;

public interface PedidosDao {
	void incluirPedido(Pedido pedido) throws Exception;

	List<Pedido> listarPedidos(int idCliente) throws Exception;
}