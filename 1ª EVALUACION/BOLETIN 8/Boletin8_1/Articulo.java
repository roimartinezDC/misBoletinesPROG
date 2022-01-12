package boletin8_1;
/**
 * @author Roi Martínez
 */
public class Articulo {
    private String nombre;
    private int ventas;
    private String tipo;
    
    public Articulo(String nom, int nVentas) {
        nombre = nom;
        ventas = nVentas;
    }
    
    public void tipo() {
        if(ventas <= 100) {
            tipo = "bajo";
        }else if(ventas>100 && ventas<=500) {
            tipo = "medio";
        }else if(ventas>500 && ventas<=1000) {
            tipo = "alto";
        }else {
            tipo = "primera necesidad";
        }
        System.out.println("El artículo es de tipo \""+tipo+"\"");
    }
}
