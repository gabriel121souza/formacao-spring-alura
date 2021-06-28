import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestarConexao {

	public static void main(String[] args) throws SQLException {

//		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/estudoAlura&postgres&123456?&useTimezone=true&serverTimezone=UTC");
	/*	String url = "jdbc:postgresql://localhost:5432/estudoAlura";  
		String user = "postgres";
		String senha = "123456";
		Connection connection = DriverManager.getConnection(url,user,senha);
		System.out.println("fechando conexao!!");
		*/
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		System.out.println("fechando conexao");
		connection.close();
	}

}
