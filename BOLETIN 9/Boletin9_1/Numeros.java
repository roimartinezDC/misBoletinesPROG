package boletin9_1;
/**
 * @author Roi Martínez
 */
import javax.swing.*;
public class Numeros {
    public Numeros() {
    }
    public void tipos() {
        double num;
        JOptionPane.showMessageDialog(null, "Introduzca 10 numeros");
        int i = 1;
        int pos=0, neg=0, cer = 0;
        while(i<11) {
            num = Double.parseDouble((JOptionPane.showInputDialog("NUM "+i)));
            System.out.println(num);
            if(num>0) {
                pos++;
            }else if(num<0) {
                neg++;
            }else {
                cer++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Nºs POSITIVOS: "+pos+"\nNºs NEGATIVOS: "+neg+"\nNº de 0s : "+cer);
    } 
}
