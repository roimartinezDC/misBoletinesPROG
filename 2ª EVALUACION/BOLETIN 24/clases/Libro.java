package clases;


/**
 * @author Roi Martínez
 */

public class Libro implements Comparable {
    private String titulo;
    private String autor;
    private String ISBN;
    private int prezo;
    private int stock;
    
    public Libro() {
    }
    public Libro(String titulo, String autor, String isbn, int precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = isbn;
        this.prezo = precio;
        this.stock = stock;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public String getISBN() {
        return this.ISBN;
    }
    public int getPrecio() {
        return this.prezo;
    }
    public int getStock()  {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Object o) {
        Libro a = (Libro) o;
        if (this.titulo.compareToIgnoreCase(a.titulo) > 0) {
            return 1;
        }else if (this.titulo.compareToIgnoreCase(a.titulo) < 0) {
            return -1;
        }else {
            return 0;
        }
    }
    
    
}

