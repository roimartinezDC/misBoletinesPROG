package boletin15;

/**
 * @author Roi Martínez
 */

public class Disco extends Multimedia{
    private String genero;
    
    public Disco() {
    }
    public Disco(String titulo, String autor, String formato, float duracion, String genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }
    
    public String getGenero() {
        return genero;
    }
    
    @Override
    public String toString() {
        return(super.toString()+"\nGénero: "+genero);
    }
}
