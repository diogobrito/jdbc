package br.com.fiap.roteiro2.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.fiap.dao.ClientesDao;
import br.com.fiap.dao.PedidosDao;
import br.com.fiap.dao.impl.MySQLClientesDao;
import br.com.fiap.dao.impl.MySQLPedidosDao;

public class MySQLDaoFactory extends DaoFactory {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/vendas";

	public static Connection criarConexao() throws Exception {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, "root", "fiap");
	}

	@Override
	public ClientesDao getClientesDao() {
		return new MySQLClientesDao();
	}

	@Override
	public PedidosDao getPedidosDao() {
		return new MySQLPedidosDao();
	}
}