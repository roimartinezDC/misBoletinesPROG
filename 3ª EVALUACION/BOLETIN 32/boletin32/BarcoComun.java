package boletin32;

public class BarcoComun extends Barco {
    
    private static int cont = 0;
    
    public BarcoComun(float eslora, int dias) {
        cont++;
        this.matricula = "COMUN"+cont;
        this.eslora = eslora;
        this.diasAlq = dias;
    }
    
    @Override
    public void factura() {
        double modulo = 10*eslora;
        double res = diasAlq*modulo;
        this.pAlquiler = res;
        
        System.out.println("MATRICULA: "+matricula+"\n"
                + "ESLORA: "+eslora+"\n"
                + "PRECIO ALQ.: "+pAlquiler+" €");
        System.out.println("");
    }
    
}
