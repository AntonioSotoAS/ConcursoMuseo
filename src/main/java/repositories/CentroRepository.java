package repositories;

import model.Centro;

import java.util.List;

public interface CentroRepository {

    List<Centro> getCentros(Integer idMuseo);
    void agregarCentro(Centro centro);

}
