package boletin26;

/**
 * @author Roi Martínez
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Componentes implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton bImprimir, bLimpiar;
    JLabel etiqNombre, etiqPassw;
    JTextField nombre, password;
    JTextArea textarea;
    
    public Componentes() {
    }
    
    public void crear() {
        marco = new JFrame("Boletin 26");
        panel = new JPanel();
        etiqNombre = new JLabel("NOMBRE");
        etiqPassw = new JLabel("PASSWORD");
        nombre = new JTextField();
        password = new JTextField();
        textarea = new JTextArea("Área de texto");
        bImprimir = new JButton("IMPRIMIR");
        bLimpiar = new JButton("LIMPIAR");
        
        marco.setBounds(100, 100, 600, 600);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        panel.setSize(600, 600);
        panel.setLayout(null);
        
        etiqNombre.setBounds(50, 50, 100, 20);
        nombre.setBounds(200, 50, 150, 20);
        
        etiqPassw.setBounds(50, 100, 100, 20);
        password.setBounds(200, 100, 150, 20);
        
        textarea.setBounds(50, 170, 300, 100);
        
        bLimpiar.setBounds(50, 310, 100, 50);
        
        bImprimir.setBounds(250, 310, 100, 50);
        
        panel.add(etiqNombre);
        panel.add(nombre);
        panel.add(etiqPassw);
        panel.add(password);
        panel.add(textarea);
        panel.add(bImprimir);
        panel.add(bLimpiar);
        marco.add(panel);
        
        bImprimir.addActionListener(this);
        bLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == bLimpiar) {
            nombre.setText(null);
            password.setText(null);
            textarea.setText(null);
        } else {
            textarea.setText("Hola "+nombre.getText());
        }
    }
}
