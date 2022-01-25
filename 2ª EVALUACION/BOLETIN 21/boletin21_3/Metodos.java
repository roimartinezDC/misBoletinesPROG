package boletin21_3;


import javax.swing.JOptionPane;
import libreriaroi.Mostrar;

/**
 * @author Roi Martínez
 */

public class Metodos {
    public static int buscarNota(int[] notas, String[] nombres, String nombre) {
        int nota = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nombre)) {
                nota = notas[i];
            }
        }
        return nota;
    }
    public static void mostarAprobadosYSuspensos(int[] notas, String[] nombres) {
        String aprobados = "";
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados += nombres[i]+"\n";
            } 
        }
        JOptionPane.showMessageDialog(null, "APROBADOS: \n"+aprobados);
    }
    public static void notasOrdenadas(int[] notas, String[] nombres) {
        int copia; 
        String copiaNom;
        for (int i = 0; i < notas.length; i++) {
            for (int e=i+1; e < notas.length; e++) {
                if (notas[i] > notas[e]) {
                    copia = notas[i];
                    copiaNom = nombres[i];
                    
                    notas[i] = notas[e];
                    nombres[i] = nombres[e];
                    
                    notas[e] = copia;
                    nombres[e] = copiaNom;
                }
            }
        }
    }
    public static void mostrarMatrices(int[] notas, String[] nombres) {
        String msg = "";
        for (int i = 0; i < notas.length; i++) {
            msg += notas[i]+" - "+nombres[i]+"\n";
        }
        Mostrar.mensaje(msg);
    }
}
