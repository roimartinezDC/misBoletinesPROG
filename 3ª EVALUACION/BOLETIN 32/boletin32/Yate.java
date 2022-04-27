package boletin32;

public class Yate extends Barco {
    
    private int potencia;
    private int nCamarotes;
    private static int cont = 0;
    
    public Yate(float eslora, int potencia, int nCam, int dias) {
        cont++;
        this.matricula = "YATE"+cont;
        this.eslora = eslora;
        this.potencia = potencia;
        this.nCamarotes = nCam;
        this.diasAlq = dias;
    }

    @Override
    public void factura() {
        double modulo = 10*eslora;
        double extra = 2*potencia+25*nCamarotes;
        double res = diasAlq*modulo+extra;
        this.pAlquiler = res;
        
        System.out.println("MATRICULA: "+matricula+"\n"
                + "ESLORA: "+eslora+"\n"
                + "PRECIO ALQ.: "+pAlquiler+" €");
        System.out.println("");
    }
    
}
