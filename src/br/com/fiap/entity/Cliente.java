package br.com.fiap.entity;

import java.io.Serializable;
import java.util.List;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nome;
	private String email;
	private List<Pedido> pedido;
	
	 
	
	public Cliente(String nome, String email, List<Pedido> pedido) {
		super();
		this.nome = nome;
		this.email = email;
		this.pedido = pedido;
	}	
	
	public Cliente(int id, String nome, String email, List<Pedido> pedido) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.pedido = pedido;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Pedido> getPedido() {
		return pedido;
	}
	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
}
