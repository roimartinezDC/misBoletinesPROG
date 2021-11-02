package boletin7_3;
/**
 * @author Roi Martínez
 */
public class Numeros {
    public Numeros() {
    }
    
    public void simbolos(double num) {
        if(num>0) {
            System.out.println("+");
        }else if(num<0) {
            System.out.println("-");
        }else {
            System.out.println("0");
        }
    }
}
