package repositories;

import model.Museo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuseoRepositoryImpl implements MuseoRepository{

    private Connection getConnection() throws SQLException {
        return Conexion.getInstance();
    }

    @Override
    public List<Museo> getMuseos() {
        List<Museo> museos = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM museos")) {

            while (rs.next()) {
                Museo museo = crearMuseo(rs);
                museos.add(museo);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return museos;
    }

    private Museo crearMuseo(ResultSet rs) throws SQLException {
        Museo museo = new Museo();
        museo.setIdMuseo(rs.getInt("id_museo"));
        museo.setCodMuseo(rs.getString("cod_museo"));
        museo.setNombre(rs.getString("nombre"));
        museo.setCalle(rs.getString("calle"));
        museo.setCodMuseo(rs.getString("cod_postal"));
        museo.setIdEstado(rs.getInt("id_estado"));
        return museo;
    }

    @Override
    public void agregarMuseo(Museo museo) {
        try (PreparedStatement stmt = getConnection().prepareStatement(
                "INSERT INTO museos (cod_museo, nombre, calle, cod_postal, id_estado) "
                        + "VALUES (?, ?, ?, ?, ?)")) {

            stmt.setString(1, museo.getCodMuseo());
            stmt.setString(2, museo.getNombre());
            stmt.setString(3, museo.getCodMuseo());
            stmt.setString(4, museo.getCodPostal());
            stmt.setInt(5, museo.getIdEstado());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
