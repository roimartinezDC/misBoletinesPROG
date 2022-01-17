package boletin19;

/**
 * @author Roi Martínez
 */

public class Boletin19 {
    public static void main(String[] args) {
        IPodeCantar canario = new Canario();
        IPodeCantar tenor = new Persoa();
        canario.cantar();
        tenor.cantar();
    }
}