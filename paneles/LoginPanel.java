package paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import modulos.DashBoard;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import control.LoginControler;

public class LoginPanel  {
private JPanel loginPanel;

public LoginPanel (){
 loginPanel = new JPanel();
 loginPanel.setSize(500, 800);
 loginPanel.setOpaque(true);
 loginPanel.setBackground(Color. WHITE);
 loginPanel.setLayout(new GridBagLayout());

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
 loginPanel.add(titulo, gbc);


//Entrada correo
JTextField entradaCorreo = new JTextField();
entradaCorreo.setPreferredSize(new Dimension(100, 50));
gbc.gridx = 1; 
gbc.gridy = 1; 
loginPanel.add(entradaCorreo, gbc);


//Entrada contraseña
JPasswordField entraContrasena = new JPasswordField();
entraContrasena.setSize(new Dimension(100, 50));
gbc.gridx = 1; 
gbc.gridy = 2; 
loginPanel.add(entraContrasena, gbc);

//BOTON
JButton btnIngresar = new JButton("Ingresar");
btnIngresar.setPreferredSize(new Dimension(100, 50));
gbc.gridx = 1;
gbc.gridy = 3;
gbc.anchor = GridBagConstraints.EAST;
gbc.fill = GridBagConstraints.NONE;
loginPanel.add(btnIngresar, gbc);

//Acción del botón 
btnIngresar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){

        String entradaUsuario=entradaCorreo.getText();
        String entradaContra = new String(entraContrasena.getPassword());

if (new LoginControler().validacionDatos(entradaContra, entradaContra)) {
  new DashBoard();
  JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginPanel);
  frame.dispose();
}
    }
});
}

public JPanel getPanel() {
    return loginPanel;
}
}
