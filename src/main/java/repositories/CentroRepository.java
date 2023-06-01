package repositories;

import java.util.List;

public interface CentroRepository {

    List<String> getCentros();
    void agregarCentro(String centro);

}
