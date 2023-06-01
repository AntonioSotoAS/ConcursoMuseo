package repositories;

import model.Centro;
import model.Museo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CentroRepositoryImpl implements CentroRepository{

    private Connection getConnection() throws SQLException {
        return Conexion.getInstance();
    }

    @Override
    public List<Centro> getCentros(Integer idMuseo) {
        List<Centro> centros = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM centros WHERE id_museo = " + idMuseo)) {

            while (rs.next()) {
                Centro centro = crearCentro(rs);
                centros.add(centro);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return centros;
    }

    private Centro crearCentro(ResultSet rs) throws SQLException {
        Centro centro = new Centro();
        centro.setIdCentro(rs.getInt("id_centro"));
        centro.setDireccion(rs.getString("direccion"));
        centro.setCodCentro(rs.getString("cod_centro"));
        centro.setIdEstado(rs.getInt("id_estado"));
        return centro;
    }

    @Override
    public void agregarCentro(Centro centro) {
        try (PreparedStatement stmt = getConnection().prepareStatement(
                "INSERT INTO centros (id_museo, direccion, cod_centro, id_estado) "
                        + "VALUES (?, ?, ?, ?)")) {

            stmt.setInt(1, centro.getMuseo().getIdMuseo());
            stmt.setString(2, centro.getDireccion());
            stmt.setString(3, centro.getCodCentro());
            stmt.setInt(4, centro.getIdEstado());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
