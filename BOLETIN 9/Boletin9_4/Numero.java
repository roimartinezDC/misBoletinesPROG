package boletin9_4;
/**
 *
 * @author Roi Martínez
 */
import javax.swing.*;
public class Numero {
    public Numero() {
    }
    
    public void tabla() {
        int num = 1;
        while(num!=0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número :"));
            if(num!=0) {
                System.out.println("-------------------------------------------------------");
                for(int i=0;i<=10;i++) {
                    System.out.println(num+"*"+i+"="+num*i);
                }
            }
        }
    }
}
