package boletin11_1;
/**
 *
 * @author Roi Martínez
 */
import javax.swing.*;
public class Juego {
    public Juego() {
    }
    public void numeros() {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce número a adivinar:"));
        while(num<1||num>50) {
            num=Integer.parseInt(JOptionPane.showInputDialog("El número debe de estar entre 1 y 50:"));
        }
        int intentosMax=Integer.parseInt(JOptionPane.showInputDialog("Introduce número max de intentos:"));
        
      
        int intentos=1;
        int numPrueba = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número:"));
        while(intentos<intentosMax) {
            intentos++;
            if(numPrueba<num) {
                numPrueba=Integer.parseInt(JOptionPane.showInputDialog("El número es mayor que "+numPrueba));
            }else if(numPrueba>num) {
                numPrueba=Integer.parseInt(JOptionPane.showInputDialog("El número es menor que "+numPrueba));
            }
            if(numPrueba==num) {
                JOptionPane.showMessageDialog(null, "¡Acertaste!");
                break;
            }
            if(intentos==intentosMax) {
                JOptionPane.showMessageDialog(null, "Intentos máximos superados, perdiste.");
            }
        }
    }
}
