package boletin14;

/**
 * @author Roi Martínez
 */

public class Libro extends Publicacion {
    private char prestado;
    
    public Libro() {
    }
    public Libro(String titulo, int codigo, int anhoPubli) {
        super(titulo, codigo, anhoPubli);
        prestado = 'n';
    }
    
    public void setPrestado(char prestado) {
        this.prestado = prestado;
    }
    
    @Override
    public String toString() {
        return (super.toString()+"\nPrestado: "+prestado);
    }
}
