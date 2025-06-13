package paneles;

import java.awt.Color;

import javax.swing.JPanel;

public class MenuLateralPanel extends JPanel{

    public MenuLateralPanel(){
        this.setSize(getPreferredSize());
        this.setOpaque(true);
        this.setBackground(Color.RED);
    }

public JPanel getPanel(){
    return this; 
}
    
}
