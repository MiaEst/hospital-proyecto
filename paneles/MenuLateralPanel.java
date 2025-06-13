package paneles;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;


public class MenuLateralPanel extends JPanel{

      private JButton btnHistorial;
    private JButton btnPacientes;

    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension(300, 1000));

        
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets.top = 10; 


        btnHistorial = new JButton("Historial");
        btnHistorial.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        this.add(btnHistorial, gbc);

        // Botón Pacientes
        gbc.gridy = 1;
        btnPacientes = new JButton("Pacientes");
        btnHistorial.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        this.add(btnPacientes, gbc);
    }

    public JPanel getPanel() {
        return this;
    }

    public JButton getBtnHistorial() {
        return btnHistorial;
    }

    public JButton getBtnPacientes() {
        return btnPacientes;
    }
}

