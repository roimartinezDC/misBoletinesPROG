package boletin21_1;

/**
 * @author Roi Martínez
 */

public class Boletin21_1 {
    public static void main(String[] args) {
        float [] numeros = new float[6];
        Metodos.crearArrayAleatorios(numeros);
        Metodos.ordenarReverso(numeros);
        Metodos.mostrarArray(numeros);
    }
}
