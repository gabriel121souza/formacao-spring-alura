import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	public DataSource dataSource;
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/estudoAlura?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("postgres");
		comboPooledDataSource.setPassword("123456");
		
		comboPooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSource;
	}
	
	/*
	public Connection recuperarConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/estudoAlura?useTimezone=true&serverTimezone=UTC", "postgres", "123456");

	}*/
	
	public Connection recuperarConexao()throws SQLException {
		return this.dataSource.getConnection();
	}
}
