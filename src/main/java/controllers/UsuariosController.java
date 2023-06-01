/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;


import java.awt.BorderLayout;
import views.Empleados;
import views.Home;

/**
 *
 * @author anton
 */
public class UsuariosController {
    
    public final Empleados vistaEmpleado = new Empleados();
    
      public UsuariosController(Home home) {
        vistaEmpleado.setSize(1280, 620);
        home.contenedor.removeAll();
        home.contenedor.add(vistaEmpleado, BorderLayout.CENTER);
        home.contenedor.revalidate();
        home.contenedor.repaint();
    }

    
}
