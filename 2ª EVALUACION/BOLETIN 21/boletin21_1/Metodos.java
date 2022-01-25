package boletin21_1;

import javax.swing.JOptionPane;

/**
 * @author Roi Martínez
 */
public class Metodos {
    public static void mostrarArray(float[] matriz) {
        String msg = "";
        for (int i = 0; i < matriz.length; i++) {
            msg = msg+matriz[i]+" / ";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    public static void crearArrayAleatorios (float[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = Math.round(1+Math.random()*50);
        }
    }
    public static void ordenarReverso(float[] matriz) {
        float copia;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int e=i+1; e < matriz.length; e++) {
                if (matriz[i] < matriz[e]) {
                    copia = matriz[i];
                    matriz[i] = matriz[e];
                    matriz[e] = copia;
                }
            }
        }
    }
}
