package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cargo;
import model.Empleado;
import model.Usuario;

public class UsuarioRepositoryImpl implements UsuarioRepository {

    private Connection getConnection() throws SQLException {
        return Conexion.getInstance();
    }

    private Usuario crearUsuario(ResultSet rs) throws SQLException {
        Usuario usuario = new Usuario();
        Empleado empleado = new Empleado();
        Cargo cargo = new Cargo();

        cargo.setIdCargo(rs.getInt("id_cargo"));
        cargo.setNombre(rs.getString("nombre"));

        empleado.setIdEmpleado(rs.getInt("id_empleado"));
        empleado.setCargo(cargo);
        empleado.setDni(rs.getString("dni"));
        empleado.setNombre(rs.getString("nombres"));
        empleado.setApellido(rs.getString("apellidos"));
        empleado.setFechaCambio(rs.getDate("fecha_cambio"));

        usuario.setIdUsuario(rs.getInt("id_usuario"));
        usuario.setEmpleo(empleado);
        usuario.setUsername(rs.getString("username"));
        usuario.setPassword(rs.getString("password"));

        return usuario;
    }

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT e.*, c.nombre, u.username,u.id_usuario, u.password "
                + "FROM usuarios as u inner join empleados as e on u.id_empleado= e.id_empleado "
                + "inner join cargos as c on c.id_cargo = e.id_cargo ")) {

            while (rs.next()) {
                Usuario usuario = crearUsuario(rs);
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    @Override
    public void agregarUsuarios(Usuario usuario) {
        try (Connection connection = getConnection(); PreparedStatement stmt = connection.prepareStatement(
                "INSERT INTO usuarios (id_empleado, username, password) VALUES (?, ?, ?)"
        )) {

            stmt.setInt(1, usuario.getEmpleo().getIdEmpleado());
            stmt.setString(2, usuario.getUsername());
            stmt.setString(3, usuario.getPassword());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error al agregar un usuario", e);
        }
    }

    @Override
    public void modificarUsuarios(Usuario usuario) {
        try (Connection connection = getConnection(); PreparedStatement stmt = connection.prepareStatement(
                "UPDATE usuarios SET id_empleado = ?, username = ?, password = ? WHERE id_usuario = ?"
        )) {

            stmt.setInt(1, usuario.getEmpleo().getIdEmpleado());
            stmt.setString(2, usuario.getUsername());
            stmt.setString(3, usuario.getPassword());
            stmt.setInt(4, usuario.getIdUsuario());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error al modificar un usuario", e);
        }
    }
}
