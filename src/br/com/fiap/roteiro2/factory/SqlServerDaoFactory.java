package br.com.fiap.roteiro2.factory;

import br.com.fiap.dao.ClientesDao;
import br.com.fiap.dao.PedidosDao;

public class SqlServerDaoFactory extends DaoFactory {
	@Override
	public ClientesDao getClientesDao() {

		return null;
	}

	@Override
	public PedidosDao getPedidosDao() {
		return null;
	}
}