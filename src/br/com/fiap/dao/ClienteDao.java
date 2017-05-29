package br.com.fiap.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pedido;

public class ClienteDao extends Dao{

	public void incluirCliente(Cliente c) throws SQLException{
		abrirConexao();
		
		String sql = "INSERT INTO CLEINTES"
				+"(NOME, EMAIL) VALUES(?,?)";
		
		ps = con.prepareStatement(sql);
		//ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, c.getNome());
		ps.setString(2, c.getEmail());
		ps.execute();
		ps.close();
		
		sql = "SELECT LAST_INSERT_ID()";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		if(rs.next()){
			c.setId(rs.getInt("ID"));
		}
		
		fecharConexao();
	}
	
	public Cliente buscarCliente(int id) throws SQLException{
		Cliente cliente = null;
		List<Pedido> pedidos = new ArrayList<>();
		
		abrirConexao();
		
		String sql = "SELECT IDPEDIDO, DATA, DESCRICAO, VALOR FROM PEDIDOS WHERE IDLCIENTE = ?";
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()){
			pedidos.add(new Pedido(rs.getInt("IDPEDIDO"),
					id,
					rs.getDate("DATA"),
					rs.getString("DESCRICAO"),
					rs.getDouble("VALOR")));
		}
		rs.close();
		ps.close();
		
		sql = "SELECT NOME, EMAIL FROM CLIENTES WHERE ID = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		
		if(rs.first()){
			cliente = new Cliente(id, rs.getString("NOME"), rs.getString("EMAIL"), pedidos);
		}
		rs.close();
		ps.close();
		return cliente;
	}
}
