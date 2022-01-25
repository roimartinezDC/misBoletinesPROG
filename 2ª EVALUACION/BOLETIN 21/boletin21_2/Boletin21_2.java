package boletin21_2;

import javax.swing.JOptionPane;

/**
 * @author Roi Martínez
 */

public class Boletin21_2 {
    public static void main(String[] args) {
        int [] notas = {4,6,8,9,10,3,7,9,2,5,5,5,7,8,10,9,5,2,1,6,7,8,3,5,9,4,1,7,7,8};
        int var = 0;
        while (var != 4) {
            var = Integer.parseInt(JOptionPane.showInputDialog("1. Mostrar nº aprobados y suspensos \n2. Nota media de la clase \n3. Nota más alta \n4. Salir"));
            switch (var) {
                case 1:
                    Metodos.mostrarAprobadosYSuspensos(notas);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Nota media: "+Metodos.notaMedia(notas));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Nota más alta: "+Metodos.notaMasAlta(notas));
                    break;
                default:
                    break;
            }
        }
        
        
        
        
    }
}
