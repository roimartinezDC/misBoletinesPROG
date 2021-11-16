package boletinextra3_1;

import javax.swing.JOptionPane;

/**
 * @author Roi Martínez
 */
public class BoletinExtra3_1 {
    public static void main(String[] args) {
        Clase cls = new Clase();
        boolean bolVar = false;
        while(bolVar==false) {
            int var = Integer.parseInt(JOptionPane.showInputDialog("1. Calcular cuota\n2. Validar fecha\n3. Salir"));
            switch(var) {
                case 1:
                    cls.calcularCuota();
                    break;
                case 2:
                    boolean bol=false;
                    while(bol==false) {
                        int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce un día:"));
                        int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce un mes:"));
                        int anho=Integer.parseInt(JOptionPane.showInputDialog("Introduce un año:"));
                        bol=cls.esFechaValida(dia, mes, anho);
                    }
                    break;
                case 3:
                    bolVar=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción erronea");
                    break;
            }
        }
        
        
        
    }
}
