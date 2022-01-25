package boletin21_4;

import javax.swing.JOptionPane;

/**
 * @author Roi Martínez
 */

public class Boletin21_4 {
    public static void main(String[] args) {
        
        int nif = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los números del NIF: "));
        char letra = Metodos.calcularLetraDNI(nif);
        if (letra == 'ñ') {
            JOptionPane.showMessageDialog(null, "Secuencia de números introducida inválida");
        } else {
            JOptionPane.showMessageDialog(null, nif+" "+letra);
        }
        
    }
}
