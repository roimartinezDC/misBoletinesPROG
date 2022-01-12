package boletin18;

/**
 * @author Roi Martínez
 */

import javax.swing.*;

public class ConversorTemperaturas {
    
    public void centAFharenheit() throws Exception {
        float cent = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la temperatura en Cº"));
        if (cent < 80) {
            throw new TemperaturaErradaExcepcion("La temperatura(ºC) no puede ser menor de 80º");
        } else {
            double x = (9/5) * cent + 32.4;
            float far = (float) x;
            JOptionPane.showMessageDialog(null, far+"ºF");
        }
    }
    
    public void centAReamur() throws Exception {
        float cent = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la temperatura en Cº"));
        if (cent < 80) {
            throw new TemperaturaErradaExcepcion("La temperatura(ºC) no puede ser menor de 80º");
        } else {
            double x = (4/5) * cent;
            float rea = (float) x;
            JOptionPane.showMessageDialog(null, rea+"ºR");
        }
    }
}
