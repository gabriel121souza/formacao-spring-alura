import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class testaRemocao {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection conn = factory.recuperarConexao();
		
		Statement stm = conn.createStatement();
		stm.execute("DELETE FROM produto WHERE id > 2");
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("quantidade de linha que foi deletada: " + linhasModificadas);
	}
}