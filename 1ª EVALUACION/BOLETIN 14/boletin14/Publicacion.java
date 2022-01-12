package boletin14;

/**
 * @author Roi Martínez
 */

public class Publicacion {
    private String titulo;
    private int codigo = 0;
    private int anhoPubli;
    
    public Publicacion() {
    }

    public Publicacion(String titulo, int codigo, int anhoPubli) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.anhoPubli = anhoPubli;
    }
    
    public int getAnho() {
        return anhoPubli;
    }
    public int getCodigo() {
        return codigo;
    }
    
    @Override
    public String toString() {
        return ("Título: "+titulo+"\nCódigo: "+codigo+"\nAño publicación: "+anhoPubli);
    }
}
