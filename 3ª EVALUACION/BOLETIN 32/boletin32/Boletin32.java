package boletin32;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin32 {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<>();
        int var = 0;
        while (var != 2) {
            var = Integer.parseInt(JOptionPane.showInputDialog("1. AÑADIR BARCO \n2. SALIR"));
            switch (var) {
                case 1:
                    float eslora = Float.parseFloat(JOptionPane.showInputDialog("METROS DE ESLORA:"));
                    int nDias = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DE DIAS DE ALQUILER:"));
                    int var2 = Integer.parseInt(JOptionPane.showInputDialog("TIPO DE BARCO: \n1. BARCO COMUN \n2. VELERO \n3. EMBARCACION DEPORTIVA \n4. YATE"));
                    switch (var2) {
                        case 1:
                            BarcoComun bc = new BarcoComun(eslora, nDias);
                            barcos.add(bc);
                            bc.factura();
                            break;
                        case 2:
                            int mastiles = Integer.parseInt(JOptionPane.showInputDialog("Nº DE MASTILES:"));
                            Velero v = new Velero(eslora, mastiles, nDias);
                            barcos.add(v);
                            v.factura();
                            break;
                        case 3:
                            int potencia = Integer.parseInt(JOptionPane.showInputDialog("POTENCIA (CV):"));
                            EmbarcacionDeportiva ed = new EmbarcacionDeportiva(eslora, potencia, nDias);
                            barcos.add(ed);
                            ed.factura();
                            break;
                        case 4:
                            potencia = Integer.parseInt(JOptionPane.showInputDialog("POTENCIA (CV):"));
                            int nCamarotes = Integer.parseInt(JOptionPane.showInputDialog("Nº CAMAROTES:"));
                            Yate y = new Yate(eslora, potencia, nCamarotes, nDias);
                            barcos.add(y);
                            y.factura();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }
}
