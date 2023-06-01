package controllers;

import java.awt.Component;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import views.Home;

public class HomeController {

    private final Home home = new Home();
    private int index;

    private MuseosController museosController;

    public HomeController() {

        home.materialTabbed1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = home.materialTabbed1.getSelectedIndex();

                switch (index) {
                    case 0:
                        museosController = new MuseosController(home);
                        museosController.vistaMuseo.setVisible(true);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new HomeController().home.setVisible(true);
        });
    }
}
