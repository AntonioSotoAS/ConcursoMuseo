package repositories;

import model.Centro;
import model.Museo;
import model.Sala;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalaRepositoryImpl implements SalaRepository{

    private Connection getConnection() throws SQLException {
        return Conexion.getInstance();
    }

    @Override
    public List<Sala> getSalas(Integer idCentro) {
        List<Sala> salas = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM salas WHERE id_centro = " + idCentro)) {

            while (rs.next()) {
                Sala sala = crearSala(rs);
                salas.add(sala);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return salas;
    }

    private Sala crearSala(ResultSet rs) throws SQLException {
        Sala sala = new Sala();
        sala.setIdSala(rs.getInt("id_sala"));
        sala.setNombre(rs.getString("nombre"));
        sala.setIdEstado(rs.getInt("id_estado"));
        return sala;
    }

    @Override
    public void agregarSala(Sala sala) {
        try (PreparedStatement stmt = getConnection().prepareStatement(
                "INSERT INTO salas (id_centro, nombre, id_estado) "
                        + "VALUES (?, ?, ?)")) {

            stmt.setInt(1, sala.getCentro().getIdCentro());
            stmt.setString(2, sala.getNombre());
            stmt.setInt(3, sala.getIdEstado());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
