package boletin9_2;
/**
 *
 * @author Roi Martínez
 */
public class Numeros {
    public Numeros() {
    }
    public void operaciones() {
        int suma;
        int producto;
        for(int i=10; i<=90; i++) {
            for(int e=10; e<=90; e++) {
                suma = i+e;
                producto = i*e;
                System.out.println(i+"+"+e+"="+suma+" // "+i+"*"+e+"="+producto);
            }
        }
    }
}
