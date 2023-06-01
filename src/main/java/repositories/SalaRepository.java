package repositories;

import model.Sala;

import java.util.List;

public interface SalaRepository {

    List<Sala> getSalas(Integer idCentro);
    void agregarSala(Sala sala);

}
