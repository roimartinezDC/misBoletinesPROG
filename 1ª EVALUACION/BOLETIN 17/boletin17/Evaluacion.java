package boletin17;

/**
 * @author Roi Martínez
 */

public class Evaluacion {
    private double notaEscrita1;
    private double notaEscrita2;
    private double notaPractica;
    private double boletinesHechos;
    private double maxBoletines;
    
    public Evaluacion() {
    }
    
    public void setNotasEscritas(double escrita1, double escrita2) {
        notaEscrita1 = escrita1;
        notaEscrita2 = escrita2;
    }
    public void setNotaPractica(double practica) {
        notaPractica = practica;
    }
    public void setBoletinesHechos(int boletines) {
        boletinesHechos = boletines;
    }
    public void setMaxBoletines(int max) {
        maxBoletines = max;
    }
    
    public double calcularVaremoEscritas() {
        double mediaEscritas = (notaEscrita1+notaEscrita2)/2;
        double varemo = mediaEscritas*0.4;
        
        return varemo;
    }
    public double calcularVaremoPractica() {
        double varemo = notaPractica*0.4;
        
        return varemo;
    }
    public double calcularVaremoBoletines() {
        int varemo = 0;
        double porcHechos = boletinesHechos/maxBoletines*100;
        
        if (porcHechos > 90) {
            varemo = 2;
        }else if (porcHechos >= 70) {
            varemo = 1;
        }
        
        return varemo;
    }
    
    public double calcularNotaFinal() {
        double puntosEscrita = calcularVaremoEscritas();
        double puntosPractica = calcularVaremoPractica();
        double puntosBoletines = calcularVaremoBoletines();
        
        double notaFinal = puntosEscrita+puntosPractica+puntosBoletines;
        
        return notaFinal;
    }
    
}
