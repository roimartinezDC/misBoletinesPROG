package boletin25;

/**
 * @author Roi Martínez
 */

public class Libro {
    private String nombre;
    private String autor;
    private int precio;
    private int unidades;
    
    public Libro() {
    }
    public Libro(String nombre, String autor, int precio, int uni) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.unidades = uni;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public int getPrecio() {
        return precio;
    }
    public int getUnidades() {
        return unidades;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
