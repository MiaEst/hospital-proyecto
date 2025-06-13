package paneles;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class BannerPanel extends JPanel{
    
    public BannerPanel(){
        this.setPreferredSize(new DimensionUIResource(500, 800));
        this.setOpaque(true);
        this.setBackground(Color.YELLOW);

    } 
    
    public JPanel getBanner(){
        return this;
    }
}
