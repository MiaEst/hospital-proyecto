import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.*;

import vistas.LoginView;


public class Main{
 public static void main(String[] args) {

     //Crear una ventana con JFrame 
     JFrame miVentana = new JFrame();   //Crea un objeto JFrame (ventana)
     miVentana.setTitle("Hospital SCL");//Establece el titulo de la ventana
     miVentana.setSize(1000,800);       //Define el tamaño (ancho, alto)
     miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     miVentana.setLayout(new BorderLayout());
     
     //Crear un panel con JPanel panelbanner
     JPanel panelbanner = new JPanel();
     panelbanner.setPreferredSize(new Dimension(500, 800));
     
     panelbanner.setOpaque(true);
     panelbanner.setBackground(Color. YELLOW);
     miVentana.add(panelbanner,BorderLayout.WEST);
     
     //Panel
     LoginView panelLogin = new LoginView();
     miVentana.add(panelLogin.getPanelLogin(), BorderLayout.CENTER);

     
     miVentana.setVisible(true);      //Hace visible la ventana
    }
}

