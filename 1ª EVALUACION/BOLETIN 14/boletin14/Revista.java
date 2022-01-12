package boletin14;

/**
 * @author Roi Martínez
 */

public class Revista extends Publicacion {
    private int numero;
    
    public Revista() {
    }
    public Revista(String titulo, int codigo, int anhoPubli, int numero) {
        super(titulo, codigo, anhoPubli);
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return (super.toString()+"\nNúmero: "+numero);
    }
}
