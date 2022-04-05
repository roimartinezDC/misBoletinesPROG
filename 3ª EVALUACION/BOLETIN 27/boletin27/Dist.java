package boletin27;

/**
 * @author Roi Martínez
 */

import java.awt.*;
import javax.swing.*;

public class Dist {
    JFrame marco;
    JPanel panel1;
    JPanel panel2;
    JButton bImprimir, bLimpiar, bBoton;
    JLabel etiqNombre, etiqPassw;
    JTextField nombre, password;
    JTextArea textarea, area2;
    JList lista;
    
    
    public void crear() {
        marco = new JFrame("Boletin 27");
        marco.setBounds(100, 100, 600, 1200);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        
        etiqNombre = new JLabel("NOMBRE");
        etiqPassw = new JLabel("PASSWORD");
        nombre = new JTextField();
        password = new JTextField();
        textarea = new JTextArea("Área de texto");
        bImprimir = new JButton("IMPRIMIR");
        bLimpiar = new JButton("LIMPIAR");
        marco.setVisible(true);
        panel1.setSize(600, 390);
        panel1.setLayout(null);
        etiqNombre.setBounds(50, 50, 100, 20);
        nombre.setBounds(200, 50, 150, 25);
        etiqPassw.setBounds(50, 100, 100, 20);
        password.setBounds(200, 100, 150, 25);
        textarea.setBounds(50, 170, 300, 100);
        bLimpiar.setBounds(50, 310, 100, 50);
        bImprimir.setBounds(250, 310, 100, 50);
        panel1.add(etiqNombre);
        panel1.add(nombre);
        panel1.add(etiqPassw);
        panel1.add(password);
        panel1.add(textarea);
        panel1.add(bImprimir);
        panel1.add(bLimpiar);
        
        panel2 = new JPanel();
        panel2.setBounds(0, 400, 600, 600);
        panel2.setLayout(null);
        lista = new JList();
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("ElementoLista1");
        modelo.addElement("ElementoLista2");
        modelo.addElement("ElementoLista3");
        lista.setModel(modelo);
        lista.setBounds(50, 50, 150, 150);
        bBoton = new JButton("BOTON");
        bBoton.setBounds(250, 100, 100, 40);
        area2 = new JTextArea("Área de texto");
        area2.setBounds(400, 60, 100, 140);
        
        panel2.add(lista);
        panel2.add(bBoton);
        panel2.add(area2);
        
        marco.add(panel1);
        marco.add(panel2);
    }
}
