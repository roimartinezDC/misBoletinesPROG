package boletin12;

/**
 * @author Roi Martínez
 */

import javax.swing.*;

public class Boletin12 {
    
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        int num = 0;
        while (num != 4) {
            num = Integer.parseInt(JOptionPane.showInputDialog("1. Aparcar coche \n2. Retirar coche \n3. Nº de coches aparcados \n4. Salir"));
            switch(num) {
                case 1:
                    garaje.registrarCoche();
                    break;
                case 2:
                    garaje.retirarCoche();
                    break;
                case 3:
                    garaje.numeroCoches();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción errónea");
                    break;
            }
        }
        
    }
}
