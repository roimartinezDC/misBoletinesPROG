package boletin6_1;
/**
 * @author Roi Martínez
 */
public class Coche {
    private int velocidade;
    
    public Coche() {
        velocidade=0;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    public void acelerar(int valor) {
        velocidade += valor;
    }
    public void frenar(int menos) {
        velocidade -= menos;
    }
}
