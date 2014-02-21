package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;

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

	private void addParametersPersona(CallableStatement cstmt, Persona per)
			throws SQLException {
		if (cstmt != null && per != null) {
			cstmt.setInt("inDni", per.getDni());
			cstmt.setString("inNombre", per.getNombre());
			cstmt.setString("inApellido", per.getApellido());
			cstmt.setInt("inEdad", per.getEdad());
			cstmt.setLong("inSexo", per.getSexo());

			if (per instanceof Titular) {
				Titular tit = (Titular) per;
				cstmt.setInt("inNroAfiliado", tit.getNro_afiliado());
			}
			if (per instanceof Familiar) {
				Familiar fam = (Familiar) per;
				cstmt.setString("inParentesco", fam.getParentesco());
			}

		}
	}

	private ArrayList<Persona> getParams(ResultSet rs, Persona per) throws SQLException {
		if (rs != null && per != null) {
			per.setApellido(rs.getString("apellido"));
			per.setNombre(rs.getString("apellido"));
			per.setDni(rs.getInt("dni"));
			per.setEdad(rs.getInt("edad"));
			//per.setSexo(rs.getString("sexo"));
			if (per instanceof Titular) {
				Titular tit = (Titular) per;
				tit.setLugar_de_trabajo(rs.getString("lugar_de_trabajo"));
				tit.setNro_afiliado(rs.getInt("nro_afiliado"));
			}
			if (per instanceof Familiar) {
				Familiar fam = (Familiar) per;
				fam.setParentesco(rs.getString("parentesco"));
				
			}
		}

		return null;
	}

}
