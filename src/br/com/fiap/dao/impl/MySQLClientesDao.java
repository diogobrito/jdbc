package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.dao.ClientesDao;
import br.com.fiap.entity.Cliente;
import br.com.fiap.roteiro2.factory.MySQLDaoFactory;

public class MySQLClientesDao implements ClientesDao {
	Connection cn = null;
	PreparedStatement stmt;

	@Override
	public void inserirCliente(Cliente cliente) throws Exception {
		try {
			cn = MySQLDaoFactory.criarConexao();
			stmt = cn.prepareStatement("INSERT INTO CLIENTES (ID, NOME, EMAIL) VALUES (?,?,?)");
			stmt.setInt(1, cliente.getId());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getEmail());
			stmt.executeUpdate();
			
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()){
				cliente.setId(rs.getInt(1));
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			cn.close();
			stmt.close();
		}
	}

	@Override
	public Cliente buscarCliente(int id) {
		return null;
	}
	
	
}