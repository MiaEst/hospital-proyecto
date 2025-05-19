package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginView {
private JPanel panelLogin;
public LoginView (){
 panelLogin = new JPanel();
 panelLogin.setSize(500, 800);
 panelLogin.setOpaque(true);
 panelLogin.setBackground(Color. WHITE);
 panelLogin.setLayout(new GridBagLayout());

//ADMINISTRADOR DE DISEÑO
GridBagConstraints gbc = new GridBagConstraints();
gbc.insets = new Insets(10, 80, 10, 80);
gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.weightx = 1.0;


 //Titulo
 JLabel titulo = new JLabel("Login");
 titulo.setHorizontalAlignment(SwingConstants.CENTER);
 gbc.gridx = 0;
 gbc.gridy = 0;
 gbc.gridwidth = 2;
 gbc.anchor = GridBagConstraints.CENTER;
 panelLogin.add(titulo, gbc);


//Entrada correo
JTextField entradaCorreo = new JTextField();
entradaCorreo.setPreferredSize(new Dimension(100, 50));
gbc.gridx = 1; 
gbc.gridy = 1; 
panelLogin.add(entradaCorreo, gbc);


//Entrada contraseña
JPasswordField entraContrasena = new JPasswordField();
entraContrasena.setSize(new Dimension(100, 50));
gbc.gridx = 1; 
gbc.gridy = 2; 
panelLogin.add(entraContrasena, gbc);

//BOTON
JButton btnIngresar = new JButton("INGRESAR");
btnIngresar.setPreferredSize(new Dimension(100, 50));
gbc.gridx = 0;
gbc.gridy = 3;
gbc.gridwidth = 2;
panelLogin.add(btnIngresar, gbc);

}
public JPanel getPanelLogin() {
    return panelLogin;
}}
