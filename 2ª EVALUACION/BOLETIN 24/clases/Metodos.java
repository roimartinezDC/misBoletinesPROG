package clases;

import java.util.ArrayList;
import libreriaroi.Leer;
import libreriaroi.Mostrar;

/**
 * @author Roi Martínez
 */

public class Metodos {
    public static void agregar(ArrayList<Libro> biblioteca) {
        String titulo = Leer.inString("Titulo");
        String autor = Leer.inString("Autor:");
        String isbn = Leer.inString("ISBN:");
        int precio = Leer.inInteger("Precio:");
        int stock = Leer.inInteger("Nº de unidades:");
        
        Libro libro = new Libro(titulo,autor,isbn,precio,stock);
        
        biblioteca.add(libro);
    }
    
    public static void ordenar(ArrayList<Libro> biblio) {
        Libro copia;
        for (int i = 0; i < biblio.size(); i++) {
            for (int e = i+1; e < biblio.size(); e++) {
                if (biblio.get(i).compareTo(biblio.get(e)) > 0) {
                    copia = biblio.get(i);
                    biblio.set(i, biblio.get(e));
                    biblio.set(e, copia);
                }
            }
        }
    }
    
    public static void mostrar(ArrayList<Libro> biblioteca) throws ExcepcionNull {
        if (biblioteca.size() != 0) {
            System.out.println();
            for (Libro libro : biblioteca) {
                System.out.println("Titulo: "+libro.getTitulo());
                System.out.println("Autor: "+libro.getAutor());
                System.out.println("ISBN: "+libro.getISBN());
                System.out.println("Precio: "+libro.getPrecio()+" €");
                System.out.println("Stock: "+libro.getStock());
                System.out.println();
            }
        }else {
            throw new ExcepcionNull("Nada que mostrar, array vacía");
        }
        
    }
    
    public static void vender(ArrayList<Libro> biblioteca) throws ExcepcionNull {
        String isbn = Leer.inString("Introduzca el isbn del libro vendido:");
        boolean vend = false;
        
        for (int i = 0; i < biblioteca.size(); i++) {
            if (biblioteca.get(i).getISBN().equals(isbn) && biblioteca.get(i).getStock() > 0) {
                int newStock = biblioteca.get(i).getStock()-1;
                biblioteca.get(i).setStock(newStock);
                Mostrar.mensaje("Libro vendido");
                vend = true;
                break;
            } 
        }
        if (vend == false) {
            throw new ExcepcionNull("ISBN no encontrado");
        }
    }
    
    public static void eliminarVacios(ArrayList<Libro> biblio) throws ExcepcionNull {
        boolean bol = false;
        for (int i = 0; i < biblio.size(); i++) {
            if (biblio.get(i).getStock() <= 0) {
                biblio.remove(i);
                bol = true;
            }
        }
        if (bol != true) {
            throw new ExcepcionNull("No se ha encontrado ningún libro con stock a '0'");
        }
    }
    
    public static void consultar(ArrayList<Libro> biblio) throws ExcepcionNull {
        String titulo = Leer.inString("Titulo del libro:");
        boolean bol = false;
        
        for (Libro libro : biblio) {
            if (libro.getTitulo().toLowerCase().startsWith(titulo.toLowerCase())) {
                System.out.println("Titulo: "+libro.getTitulo());
                System.out.println("Autor: "+libro.getAutor());
                System.out.println("ISBN: "+libro.getISBN());
                System.out.println("Precio: "+libro.getPrecio()+" €");
                System.out.println("Stock: "+libro.getStock());
                System.out.println();
                bol = true;
            }
        }
        
        if (bol == false) {
            throw new ExcepcionNull("No se ha encontrado ningún libro que empiece por ese título");
        }
    }
}
