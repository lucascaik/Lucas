package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.cefeteic.psw.dados.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;

		String sql = "insert into contatos" + "(nome, email, endereco, dataNascimento)" + "values (?, ?, ?, ?)";

		try {
			con = ConnectionFactory.getConnection();
			stmt = con.prepareStatement(sql);

			stmt.setString(1, "Rafael");
			stmt.setString(2, "razborges@gmail.com");
			stmt.setString(3, "R. Bicuiba 37");
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));

			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}