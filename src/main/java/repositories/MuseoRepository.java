package repositories;

import java.util.List;

public interface MuseoRepository {

    List<String> getMuseos();
    void agregarMuseo(String museo);



}
