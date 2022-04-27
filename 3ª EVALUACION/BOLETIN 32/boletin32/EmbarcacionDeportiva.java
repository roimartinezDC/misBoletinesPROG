package boletin32;

public class EmbarcacionDeportiva extends Barco {
    
    private int potencia;
    private static int cont = 0;
    
    public EmbarcacionDeportiva(float eslora, int pot, int dias) {
        cont++;
        this.matricula = "DEPOR"+cont;
        this.eslora = eslora;
        this.potencia = pot;
        this.diasAlq = dias;
    }
    
    @Override
    public void factura() {
       double modulo = 10*eslora;
       double res = diasAlq*modulo+potencia*2;
       this.pAlquiler = res;
       
       System.out.println("MATRICULA: "+matricula+"\n"
                + "ESLORA: "+eslora+"\n"
                + "PRECIO ALQ.: "+pAlquiler+" €");
        System.out.println("");
    }
    
}
