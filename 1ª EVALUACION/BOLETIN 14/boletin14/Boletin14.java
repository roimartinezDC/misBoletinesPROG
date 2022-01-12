package boletin14;

/**
 * @author Roi Martínez
 */

public class Boletin14 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Libro1", 1, 2012);
        Revista revista1 = new Revista("Revista1", 2, 2014, 01);
        
        System.out.println(libro1.toString());
        
    }
}
