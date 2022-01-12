package boletin9_3;
/**
 * @author Roi Martínez
 */
import javax.swing.*;
public class Rectangulo {
    public Rectangulo() {
    }
    public void area() {
        double base, altura, area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base :"));
        while(base<0) {
            base = Double.parseDouble(JOptionPane.showInputDialog("Número inválido, vuelva a introducir la base :"));
        }
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura :"));
        while(altura<0) {
            altura = Double.parseDouble(JOptionPane.showInputDialog("Número inválido, vuelva a introducir la altura :"));
        }
        
        area = base*altura;
        JOptionPane.showMessageDialog(null, "Área : "+area);
    }
}
