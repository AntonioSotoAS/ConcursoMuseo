package repositories;

import model.Empleado;
import model.Sala;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepositoryImpl {

    private Connection getConnection() throws SQLException {
        return Conexion.getInstance();
    }


    private Sala crearSala(ResultSet rs) throws SQLException {
        Sala sala = new Sala();
        sala.setIdSala(rs.getInt("id_sala"));
        sala.setNombre(rs.getString("nombre"));
        sala.setIdEstado(rs.getInt("id_estado"));
        return sala;
    }

    public List<Empleado> getEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM empleados")) {

            while (rs.next()) {
                Empleado empleado = crearEmpleado(rs);
                empleados.add(empleado);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return empleados;
    }

}
