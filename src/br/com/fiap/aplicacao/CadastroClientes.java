package br.com.fiap.aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pedido;

public class CadastroClientes {

	public static void main(String[] args) {
	
		try {
			
			System.out.println("Cadastrando Cliente ...");
			
			Pedido pedidos = new Pedido();
			
			List<Pedido> pedidosCliente = new ArrayList<>();
			
			Cliente cliente = new Cliente("João", "j@jose.com", pedidosCliente);
			cliente.incluirCliente(cliente);
			
			pedidosCliente.add(new Pedido(new Date(),"Materiais Gerais", 2000,cliente.getId()));
			pedidosCliente.add(new Pedido(new Date(),"Materiais Papelaria", 4520,cliente.getId()));
			
			for (Pedido pedido : pedidosCliente) {
				pedido = pedidos.incluirPedido(pedido);
			}
			
			System.out.println("Cadastrando Cliente Finalizado!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
