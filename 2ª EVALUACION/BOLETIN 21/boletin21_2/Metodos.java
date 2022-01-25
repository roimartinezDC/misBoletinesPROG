package boletin21_2;

import javax.swing.JOptionPane;

/**
 * @author Roi Martínez
 */

public class Metodos {
     public static void mostrarAprobadosYSuspensos(int[] matriz) {
        int aprobados = 0, suspensos = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] >= 5) {
                aprobados ++;
            } else {
                suspensos ++;
            }
        }
        JOptionPane.showMessageDialog(null, "APROBADOS: "+aprobados+" \nSUSPENSOS: "+suspensos);
    }
    public static float notaMedia(int[] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i];
        }
        int media = suma / matriz.length;
        return media;
    }
    public static int notaMasAlta(int[] matriz) {
        int masAlta = matriz[0];
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] > masAlta) {
                masAlta = matriz[i];
            }
        }
        return masAlta;
    }
}
