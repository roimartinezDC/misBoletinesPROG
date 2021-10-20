package boletin5;
/**
 * @author Roi Martínez
 */
public class Boletin5 {
    public static void main(String[] args) {
        Consumo coche1 = new Consumo();
        coche1.setLitros(50);
        coche1.setPgas(1.57);
        
        Consumo coche2 = new Consumo(500f, 90f, 100f, (double)1.38);
        
        System.out.println("Consumo medio de litros cada 100km del coche2: "+ coche2.consumoMedio());
        
        coche2.setLitros(85.6f);
        System.out.println("Velocidad media del coche2: "+coche2.getVmed());
        
        
    }
    
}
