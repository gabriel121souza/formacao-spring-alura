import java.sql.SQLException;

public class TestarPoolConexoes {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for(int i = 0; i<20; i++ ) {
			connectionFactory.recuperarConexao();
			System.out.println("conexao de numero " + i);
		}
	}

}
