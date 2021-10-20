package boletin5;
/**
 * @author Roi Martínez
 */
public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private double pGas;
    
    public Consumo() {
    }
    public Consumo(float klm, float litr, float vMedi, double pGaso) {
        km = klm;
        litros = litr;
        vMed = vMedi;
        pGas = pGaso;
    }
    
    public void setKms(float kmtr) {
        km = kmtr;
    }
    public void setLitros(float litrs) {
        litros = litrs;
    }
    public void setVmed(float vMedia) {
        vMed = vMedia;
    }
    public void setPgas(double pGasol) {
        pGas = pGasol;
    }
    
    public float getVmed() {
        return vMed;
    }
    
    public double getTempo() {
        double tempo = km / vMed;
        return tempo;
    }
    public double consumoMedio() {
        double consumo = litros*100 / km;
        return consumo;
    }
    public double consumoEuros() {
        double consumo = (litros*pGas)*100 / km;
        return consumo;
    }
    
    
}
