package repositories;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MuseoRepositoryImpl implements MuseoRepository{

    private Connection getConnection() throws SQLException {
        return Conexion.getInstance();
    }

    @Override
    public List<String> getMuseos() {
        return null;
    }

    @Override
    public void agregarMuseo(String museo) {

    }
}
