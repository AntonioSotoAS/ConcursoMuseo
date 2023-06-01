package repositories;

import java.util.List;
import model.Exposicion;

/**
 *
 * @author codertech
 */
public interface ExposicionRepository {
    
    List<Exposicion> getExposiciones();
    void agregarExposiciones(Exposicion exposicion);
    void modificarExposiciones(Exposicion exposicion);
    
    
}
