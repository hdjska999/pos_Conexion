package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static Connection conectar() {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdpos", "root", "Sami.200504");
			return cn;
		} catch(SQLException e ) {
			System.out.println("Error en la conexion local "+e);
		}
		return null;
	}
}
