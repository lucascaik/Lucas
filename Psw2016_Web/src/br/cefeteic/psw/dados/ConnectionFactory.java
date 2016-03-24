package br.cefeteic.psw.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException {
		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/psw2016", "aluno", "aluno");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
