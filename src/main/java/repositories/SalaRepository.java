package repositories;

import java.util.List;

public interface SalaRepository {

    List<String> getSalas();
    void agregarSala(String sala);

}
