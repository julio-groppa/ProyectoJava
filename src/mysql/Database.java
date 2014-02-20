package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private Connection conn = null;
	private static Database db;

	private Database() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?"
					+ "user=root&password=1234");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Database getDatabase() {
		if (db == null) {
			db = new Database();
		}
		return db;
	}

	public Connection getConnection() {
		return conn;
	}

}
