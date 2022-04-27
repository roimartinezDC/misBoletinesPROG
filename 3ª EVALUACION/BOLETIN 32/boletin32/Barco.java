package boletin32;

public abstract class Barco {
    public String matricula;
    public float eslora;
    public int diasAlq;
    public double pAlquiler;
    public static int cont;
    
    public abstract void factura();
}
