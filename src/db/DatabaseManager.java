package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.CallableStatement;

import obj.Familiar;
import obj.Persona;
import obj.Titular;
import mysql.Database;

public class DatabaseManager {

	Connection conn;
	Statement statement;
	ResultSet rs;

	public DatabaseManager() {
		conn = Database.getDatabase().getConnection();
	}

	public Boolean ping() {
		try {
			statement = conn.createStatement();
			
			rs = statement.executeQuery("Select 1");
			int ping = 0;
			while (rs.next()) {
				ping = rs.getInt(1);
			}
			if (ping == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		} finally {
			try {
				statement.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private CallableStatement addParametersPersona(CallableStatement cstmt,Persona per) throws SQLException {
		if(cstmt != null) {
			if(per != null) {
				cstmt.setInt("inDni", per.getDni());
				
				if(per instanceof Titular) {
					
				}
				if(per instanceof Familiar) {
					
				}
			}
		}
				
		
		return null;
	}
	
	
}
