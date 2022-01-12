package boletin11_2;
/**
 * @author Roi Martínez
 */
import javax.swing.*;
public class Juego {
    public Juego() {
    }
    public void aleatorios() {
        double num = Math.round(1+Math.random()*50);
        int intentos =0;
        int prueba;
        
        boolean acierto=false;
       
        while(acierto==false) {
            prueba=Integer.parseInt(JOptionPane.showInputDialog("Adivine el número :"));
            intentos++;
            if(prueba!=num) {
                if(num-prueba>20||prueba-num>20) {
                JOptionPane.showMessageDialog(null, "Muy lejos");
                }else if((num-prueba>=10&&num-prueba<=20)||(prueba-num>=10&&prueba-num<=20)) {
                    JOptionPane.showMessageDialog(null, "Lejos");
                }else if((num-prueba>5&&num-prueba<10)||(prueba-num>5&&prueba-num<10)) {
                    JOptionPane.showMessageDialog(null, "Cerca");
                }else if(num-prueba<=5||prueba-num<=5) {
                    JOptionPane.showMessageDialog(null, "Muy cerca");
                }
            }
            if(prueba==num){
                JOptionPane.showMessageDialog(null, "¡Acertaste!\nIntentos: "+intentos);
                acierto=true;
            }
        }
    }
}
