package TestPK.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getCon() throws SQLException {
		java.sql.Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://192.168.0.6:3306/erpsystem";
			conn = DriverManager.getConnection(url, "erpsystem", "trensfer");
			return conn;
		} catch (ClassNotFoundException ce) {
			// TODO: handle exception
			System.out.println(ce.getMessage());
			return null;
		}
	}
	public static void main(String[] args) throws SQLException {
		getCon();
	}

}
