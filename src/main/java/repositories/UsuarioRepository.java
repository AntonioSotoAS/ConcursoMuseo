/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.List;
import model.Usuario;

/**
 *
 * @author codertech
 */
public interface UsuarioRepository {
    
    List<Usuario> getUsuarios();
    void agregarUsuarios(Usuario usuario);
    void modificarUsuarios(Usuario usuario);
    
}
