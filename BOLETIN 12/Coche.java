package boletin12;

/**
 * @author Roi Martínez
 */

public class Coche {
    
    private String matricula;
    private int tiempo;
    
    public Coche(String matric, int tiemp) {
        matricula = matric;
        tiempo = tiemp;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public int getTiempo() {
        return tiempo;
    }
}
