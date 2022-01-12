package boletin15;

/**
 * @author Roi Martínez
 */

public class Boletin15 {
    public static void main(String[] args) {
        Pelicula pel1 = new Pelicula("titulo1", "autor1", "dvd", 120, "actor1", "actriz1");
        Disco disco1 = new Disco("disco1", "autor disco1", "mp3", 2.5f, "pop");
        
        System.out.println(pel1.toString()+"\n\n"+disco1.toString());
    }
}
