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
public interface ExposicionService {
    
    List <Exposicion> getExposiciones();
    void agregarExposicion(Exposicion activo);
    void modificarExposicion(Exposicion activo);

}
