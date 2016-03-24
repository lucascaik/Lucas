package teste;

import java.sql.SQLException;
import java.util.List;

import br.cefeteic.psw.dados.ContatoDAO;
import br.cefeteic.psw.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) {
		List<Contato> contatos = null;

		try {
			ContatoDAO dao = new ContatoDAO();
			contatos = dao.getLista();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (Contato contato : contatos) {
			System.out.println("++++++++++++++++");
			System.out.println(contato.getNome());
			System.out.println(contato.getEmail());
			System.out.println(contato.getEndereco());
			System.out.println(contato.getDataNascimento());
		}
	}
}
