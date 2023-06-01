package controllers;

import java.awt.BorderLayout;
import views.Home;
import views.Museos;

public class MuseosController {
    
    public final Museos vistaMuseo = new Museos();

    public MuseosController(Home home) {
        vistaMuseo.setSize(1280, 620);
        home.contenedor.removeAll();
        home.contenedor.add(vistaMuseo, BorderLayout.CENTER);
        home.contenedor.revalidate();
        home.contenedor.repaint();
    }

    
    
}
