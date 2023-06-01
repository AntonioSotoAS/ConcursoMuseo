/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.BorderLayout;
import views.Exposiciones;
import views.Home;

/**
 *
 * @author anton
 */
public class ExposicionController {
    
     public final Exposiciones vistaExposiciones = new Exposiciones();

    public ExposicionController(Home home) {
        vistaExposiciones.setSize(1280, 620);
        home.contenedor.removeAll();
        home.contenedor.add(vistaExposiciones, BorderLayout.CENTER);
        home.contenedor.revalidate();
        home.contenedor.repaint();
    }

    
    
}
