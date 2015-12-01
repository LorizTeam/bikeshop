package bikeshop.com.data;

import java.sql.*;

public class DBConnect {
	public Connection ConnectOracle(){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@orcl", "root1","1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	public Connection ConnectMySQL(){
		Connection conn = null;
		try {
			Class.forName ("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Class.forName ("org.gjt.mm.mysql.Driver");
		String dbName = "bikeshop";
		String hostname = "localhost";
		String port = "3306";
		String dbUserName = "root";
		String dbPassword = "1234";
		
		String jdbcUrl = "jdbc:mysql://" + hostname + ":" +
		port + "/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword;

		try {
			conn = DriverManager.getConnection (jdbcUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
}
