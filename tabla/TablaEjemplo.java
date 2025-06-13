package tabla;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import datos.pacientes;

import java.awt.*;

public class TablaEjemplo extends JPanel {
    
    public TablaEjemplo() {

        setLayout(new BorderLayout());
  String[] columnas = {"ID del paciente", "Nombre del paciente", "Edad"};
        Object[][] datos = new pacientes().getDatos();

        JTable table = new JTable(new DefaultTableModel(datos, columnas));
        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setPreferredSize(new Dimension(1600, 1000));
        this.add(scrollPane, BorderLayout.CENTER);
      }
    }