package boletin17;

/**
 * @author Roi Martínez
 */

import javax.swing.*;

public class Boletin17 {
    public static void main(String[] args) {
        int salida = 1;
        do {
            Evaluacion ev1 = new Evaluacion();

            double escrita1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota de su 1ª prueba escrita:"));
            double escrita2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota de su 2ª prueba escrita:"));
            ev1.setNotasEscritas(escrita1, escrita2);

            double practica = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota de su prueba práctica:"));
            ev1.setNotaPractica(practica);

            int boletines = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de boletines realizados:"));
            ev1.setBoletinesHechos(boletines);

            int maxBol = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nº máximo de boletines que hay:"));
            ev1.setMaxBoletines(maxBol);

            JOptionPane.showMessageDialog(null, "PRUEBAS TEÓRICAS: " + Math.round(ev1.calcularVaremoEscritas()*100.0)/100.0+"\n"
                + "PRUEBA PRÁCTICA: " + Math.round(ev1.calcularVaremoPractica()*100.0)/100.0 + "\n"
                + "BOLETINES: " + ev1.calcularVaremoBoletines() + "\n"
                + "NOTA TOTAL: " + Math.round(ev1.calcularNotaFinal()*100.0)/100.0
            );
            
            salida = Integer.parseInt(JOptionPane.showInputDialog("¿Desea calcular otra nota?\n 1 - Si\n 0 - No"));
        } while (salida!=0);
    }
}
