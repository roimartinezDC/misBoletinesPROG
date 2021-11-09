package boletin9_5;
/**
 * @author Roi Martínez
 */
import javax.swing.*;
public class Sueldos {
    public Sueldos() {
    }
    public void calculos() {
        int nTrab=0, nSueldoRango=0, nMenorMil=0;
        float porcentaje =0;
        double sueldo = 1;
        
        while(sueldo!=0) {
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un sueldo :"));
            nTrab++;
            if(sueldo!=0) {
                System.out.println(sueldo);
                if(sueldo>=1000&&sueldo<=1750) {
                    nSueldoRango++;
                }else if(sueldo<1000) {
                nMenorMil++;
                    porcentaje = (100/nTrab)*nMenorMil;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Nº salarios entre 1000 y 1750 € : "+nSueldoRango+"\n% de salarios menores de 1000€ : "+porcentaje+"%");
    }
}
