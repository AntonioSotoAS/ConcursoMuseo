package controllers;

;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import views.Home;

public class HomeController {

    private final Home home = new Home();
    private int index;

    private MuseosController museosController;
    private UsuariosController usuariosController;
    private ExposicionController exposicionController;

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
                    case 3:
                        break;
                    case 4:
                        usuariosController = new UsuariosController(home);
                        usuariosController.vistaEmpleado.setVisible(true);
                        break;
                    case 5:
                        exposicionController = new ExposicionController(home);
                        exposicionController.vistaExposiciones.setVisible(true);
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
