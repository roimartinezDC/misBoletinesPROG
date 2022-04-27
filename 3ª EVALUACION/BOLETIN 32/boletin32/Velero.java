package boletin32;

public class Velero extends Barco {
    
    private int nMastiles;
    private static int cont = 0;
    
    public Velero(float eslora, int mastiles, int dias) {
        cont++;
        this.matricula = "VELERO"+cont;
        this.eslora = eslora;
        this.nMastiles = mastiles;
        this.diasAlq = dias;
    }
    
    @Override
    public void factura() {
       double modulo = 10*eslora;
       double res = diasAlq*modulo+nMastiles*8;
       this.pAlquiler = res;
       
       System.out.println("MATRICULA: "+matricula+"\n"
                + "ESLORA: "+eslora+"\n"
                + "PRECIO ALQ.: "+pAlquiler+" €");
        System.out.println("");
    }
    
}
