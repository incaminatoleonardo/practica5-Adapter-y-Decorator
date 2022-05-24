package tp5.ejercicio4.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import tp5.ejercicio4.modelo.PersistenciaItemsServicio;

public class JdbcPersistencia implements PersistenciaItemsServicio {

	@Override
	public void guardar(String itemsServicio) { // preguntar por el archivo file

		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/objetos2", "root", "");
			PreparedStatement statement = (PreparedStatement) con
					.prepareStatement("INSERT INTO itemsservicios(itemsServicios) VALUES (?)");

			statement.setString(1, itemsServicio);
			statement.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException("No se pudo guardar en BD", e);

		} finally {
			if (con != null) {
				cerrarSesion(con);

			}
		}

	}

	private void cerrarSesion(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException("No pudo cerrar conexion", e);

		}

	}

}
