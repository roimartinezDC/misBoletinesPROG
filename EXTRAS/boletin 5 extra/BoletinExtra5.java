package boletinextra5;

/**
 * @author Roi Martínez
 */

import javax.swing.*;

public class BoletinExtra5 {
    public static void main(String[] args) {
        Docente docente = new Docente();
        
        String codigo = JOptionPane.showInputDialog("Introduzca el código del docente");
        docente.setCodigo(codigo);
        
        String nombre = JOptionPane.showInputDialog("Introduzca el nombre");
        docente.setNombre(nombre);
        
        boolean bol = false;
        int categoria = 0;
        while (bol == false) {
            categoria = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la categoría del docente: \n1 - Principal\n2 - Asociado\n3 - Auxiliar"));
            if (categoria == 1 || categoria == 2 || categoria == 3) {
                bol = true;
            }
        }
        docente.setCategoria(categoria);
        
        boolean bol2 = false;
        int estudios = 0;
        while (bol2 == false) {
            estudios = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los estudios del docente: \n1 - Maestría\n2 - Doctorado\n3 - Ambas"));
            if (estudios == 1 || estudios == 2 || estudios == 3) {
                bol2 = true;
            }
        }
        docente.setEstudios(estudios);
        
        int antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los años de antigüedad del docente"));
        docente.setAntiguedad(antiguedad);
        
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas de clase impartidas por el docente"));
        docente.setHorasClase(horas);
        
        int num = 0;
        while (num != 3) {
            num = Integer.parseInt(JOptionPane.showInputDialog("1. Calcular salario bruto \n2. Calcular salario neto \n3. Salir"));
            switch (num) {
                case 1:
                    JOptionPane.showMessageDialog(null, docente.salarioBruto()+" €");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, docente.salarioNeto()+" €");
                    break;
                default:
                    break;
            }
        }
    }
}
