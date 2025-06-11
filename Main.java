// Importa la clase JFrame del paquete javax.swing (para crear la ventana)
import java.awt.BorderLayout;
import javax.swing.*;
import paneles.BannerPanel;
import paneles.LoginPanel;

public class Main {

    public static void main(String[] args) {
        // Título y tamaño de la ventana
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000, 800);
        miVentana.setLayout(new BorderLayout());
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // BannerPanel
        paneles.BannerPanel panelBanner = new BannerPanel();
        miVentana.add(panelBanner.getJPanel(), BorderLayout.WEST);

        paneles.LoginPanel panelLogin = new LoginPanel(miVentana); 
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);
    }
}
