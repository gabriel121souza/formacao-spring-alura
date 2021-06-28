import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		/*
		String url = "jdbc:postgresql://localhost:5432/estudoAlura";  
		String user = "postgres";
		String senha = "123456";
		Connection conn = DriverManager.getConnection(url,user,senha);
		*/
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conn = connectionFactory.recuperarConexao();
		Statement stm = conn.createStatement();
		stm.execute("SELECT id, nome, descricao FROM produto");
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			Integer id = rst.getInt("id");
			System.out.println(id);
			String nome = rst.getString("nome");
			System.out.println(nome);
			String descricao = rst.getString("descricao");
			System.out.println(descricao);
			
		}
		conn.close();
	}

}