package repositories;

import model.Museo;

import java.util.List;

public interface MuseoRepository {


    List<Museo> getMuseos();
    void agregarMuseo(Museo museo);



}
