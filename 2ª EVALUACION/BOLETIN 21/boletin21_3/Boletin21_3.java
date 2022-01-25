package boletin21_3;

import javax.swing.JOptionPane;
import libreriaroi.Matrices;

/**
 * @author Roi Martínez
 */



public class Boletin21_3 {
    
    public static void main(String[] args) {
        int [] notas = new int[30];
        Matrices.arrayAleatoriosInt(notas, 1, 9);
        String [] nombres = {"Jaime", "Javier", "David", "Luis", "Adrián", "Laura", "David", "Samuel", "Sergio", "Álex", "Nuria", "Daniel", "Adrián", "David", "Iago", "Adrián", "Roi", "Sergio", "José", "David", "José Alejandro", "Héctor", "Ignacio", "Marcos", "Marta", "Hugo", "Alejandro", "Iker", "Yago", "Pablo"}; 
        
        int var = 0;
        while (var != 5) {
            var = Integer.parseInt(JOptionPane.showInputDialog("1. Nota alumno determinado \n2. Lista aprobados \n3. Notas ordenadas \n4. Buscar nota alumno \n5. Salir"));
            switch (var) {
                case 1:
                    String alumno = "Roi";
                    JOptionPane.showMessageDialog(null, alumno+" - "+Metodos.buscarNota(notas, nombres, alumno));
                    break;
                case 2:
                    Metodos.mostarAprobadosYSuspensos(notas, nombres);
                    break;
                case 3:
                    Metodos.mostrarMatrices(notas, nombres);
                    Metodos.notasOrdenadas(notas, nombres);
                    Metodos.mostrarMatrices(notas, nombres);
                    break;
                case 4:
                    String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno a buscar:");
                    int nota = Metodos.buscarNota(notas, nombres, nombre);
                    if (nota == -1) {
                        JOptionPane.showMessageDialog(null, "El alumno no existe");
                    } else {
                        JOptionPane.showMessageDialog(null, nombre+" - "+nota);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción errónea");
                    break;
            }
        }
    }
}
