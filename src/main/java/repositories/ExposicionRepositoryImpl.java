package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Empleado;
import model.Exposicion;

public class ExposicionRepositoryImpl implements ExposicionRepository {

    private Connection getConnection() throws SQLException {
        return Conexion.getInstance();
    }

    private Exposicion crearExposicion(ResultSet rs) throws SQLException {
        Empleado empleado = new Empleado();
        Exposicion exposicion = new Exposicion();

        empleado.setIdEmpleado(rs.getInt("id_empleado"));
        empleado.setNombre(rs.getString("nombres"));

        exposicion.setIdExposicion(rs.getInt("id_exposicion"));
        exposicion.setEmpleo(empleado);
        exposicion.setFechaInicio(rs.getDate("fecha_inicio"));
        exposicion.setFechaFin(rs.getDate("fecha_fin"));
        exposicion.setIdEstado(rs.getInt("id_estado"));

        return exposicion;
    }

    @Override
    public List<Exposicion> getExposiciones() {

        List<Exposicion> exposiciones = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT e.*, emp.nombres "
                + "from exposiciones as e inner join empleados as emp on e.id_empleado = emp.id_empleado ")) {

            while (rs.next()) {
                Exposicion exposicion = crearExposicion(rs);
                exposiciones.add(exposicion);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return exposiciones;

    }

    @Override
    public void agregarExposiciones(Exposicion exposicion) {
        try (Connection connection = getConnection(); PreparedStatement stmt = connection.prepareStatement(
                "INSERT INTO exposiciones (id_empleado, fecha_inicio, fecha_fin, id_estado) VALUES (?, ?, ?, ?)"
        )) {

            stmt.setInt(1, exposicion.getEmpleo().getIdEmpleado());
            stmt.setDate(2, new java.sql.Date(exposicion.getFechaInicio().getTime()));
            stmt.setDate(3, new java.sql.Date(exposicion.getFechaFin().getTime()));
            stmt.setInt(4, exposicion.getIdEstado());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error al agregar una exposición", e);
        }
    }

    @Override
    public void modificarExposiciones(Exposicion exposicion) {
        try (Connection connection = getConnection(); PreparedStatement stmt = connection.prepareStatement(
                "UPDATE exposiciones SET id_empleado = ?, fecha_inicio = ?, fecha_fin = ?, id_estado = ? WHERE id_exposicion = ?"
        )) {

            stmt.setInt(1, exposicion.getEmpleo().getIdEmpleado());
            stmt.setDate(2, new java.sql.Date(exposicion.getFechaInicio().getTime()));
            stmt.setDate(3, new java.sql.Date(exposicion.getFechaFin().getTime()));
            stmt.setInt(4, exposicion.getIdEstado());
            stmt.setInt(5, exposicion.getIdExposicion());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error al modificar una exposición", e);
        }
    }

}
