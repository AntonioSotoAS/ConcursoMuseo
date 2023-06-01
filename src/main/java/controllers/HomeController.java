package controllers;

import views.Home;

public class HomeController {
    
    private final Home home = new Home();
    
    public void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            home.setVisible(true);
        });
    }
}