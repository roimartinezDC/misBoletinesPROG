package boletin6_3;
/**
 * @author Roi Martínez
 */
public class Circulo {
    private double radio;
    private final double PI = 3.14;
    
    public Circulo() {
    }
    public Circulo(double rad) {
        radio = rad;
    }
    
    public void setRadio(double radi) {
        radio = radi;
    }
    public double getRadio() {
        return radio;
    }
    
    public double calcularArea() {
        double area = Math.round(Math.pow(radio, 2)*PI);
        return area;
    }
    public double calcularLonxitude() {
        double lonx = radio*2*PI;
        return lonx;
    }
}
