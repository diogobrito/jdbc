package br.com.fiap.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {

	private static Connection con;
	private static Statement st;
	private static PreparedStatement ps;
	
	private static String url = "jdbc:mysql://localhost:3306/vendas";
	
	public static void main(String[] args){
		try {
			con = DriverManager.getConnection(url, "root", "fiap");
			
			
			/*String nome = "Hello";
			String email = "w@rd.com";
			
			

			ps.setString(1, nome);
			ps.setString(2, email);
			*/
			String sql = "INSERT INTO CLIENTES(NOME,EMAIL) VALUES(?,?)";
			ResultSet rs = ps.executeQuery("SELECT * FROM CLIENTES");
			ps = con.prepareStatement(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("email"));
			}
			rs.close();
			ps.execute();
			ps.close();

			//st = con.createStatement();
			//st.execute("INSERT INTO CLIENTES (NOME, EMAIL) "
			//		+ "VALUES ('"+nome+"', '"+email+"' )");
			
			
			
			//st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
