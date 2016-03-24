package teste;

import java.sql.SQLException;

import br.cefeteic.psw.dados.ContatoDAO;
import br.cefeteic.psw.modelo.Contato;

public class TesteContatoDAO {
	public static void main(String[] args) {
		Contato contato = new Contato("Giovane", "gizborges@gmail.com", "Travessa Almeirim 5");

		try {
			ContatoDAO dao = new ContatoDAO();
			dao.adiciona(contato);
			System.out.println("Dados gravados.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
