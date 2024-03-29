package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int idCliente;
	private Date data;
	private String descricao;
	private double valor;
	
	
	
	public Pedido(int id, int idCliente, Date data, String descricao, double valor) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}
	public Pedido(java.sql.Date date, String string, double double1, int id2, int int1) {
		// TODO Auto-generated constructor stub
	}
	public Pedido(Date date, String string, int i, int id2) {
		// TODO Auto-generated constructor stub
	}
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
