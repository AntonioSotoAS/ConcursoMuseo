/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;
import java.util.List;

/**
 *
 * @author codertech
 */
public interface TrasladoService {
    
    List <Traslado> getActivos();
    void agregarTraslado(Traslado traslado);
    void modificarTraslado(Traslado traslado);

}
