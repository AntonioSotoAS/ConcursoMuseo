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
public interface CompraService {
    
    List <Compra> getCompras();
    void agregarCompra(Compra compra);
    void modificarCompra(Compra compra);

}
