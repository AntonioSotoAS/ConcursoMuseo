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
public interface ActivoService {
    
    List <Activo> getActivos();
    void agregarActivo(Activo activo);
    void modificarActivo(Activo activo);

}
