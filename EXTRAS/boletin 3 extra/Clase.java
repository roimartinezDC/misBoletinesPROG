package boletinextra3_1;
/**
 * @author Roi Martínez
 */
import javax.swing.*;
public class Clase {
    public Clase() {
    }
    public void calcularCuota() {
        double cuota=800;
        int var;
        boolean bol = false;
        while(bol==false) {
            var = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un número según su condición :\n"
                + "1. Persona +65 años \n"
                + "2. Menor de 21 años \n"
                + "3. Otro"));
            switch(var) {
                case 1:
                    bol=true;
                    cuota=cuota-cuota/100*40;
                    break;
                case 2: 
                    bol=true;
                    int var2;
                    boolean bol2=false;
                    while(bol2==false) {
                    var2 = Integer.parseInt(JOptionPane.showInputDialog("¿Son tus padres socios?\n1. Si\n2. No"));
                        switch(var2) {
                            case 1:
                                bol2=true;
                                cuota = cuota-cuota/100*45;
                                break;
                            case 2:
                                bol2=true;
                                cuota = cuota-cuota/100*25;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción erronea");
                                break;
                        }
                    }
                    break;
                case 3:
                    bol=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción erronea");
            }
        }
        JOptionPane.showMessageDialog(null, "Su cuota es de : "+cuota+"€");
    }
    
    public boolean esFechaValida(int dia, int mes, int anho) {
        boolean bol=true;
        if(anho>1600&&anho<3000) {
            if(mes>=1&&mes<=12) {
                switch(mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if(dia>31){
                            JOptionPane.showMessageDialog(null, "Día inválido");
                            bol=false;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if(dia>30){
                            JOptionPane.showMessageDialog(null, "Día inválido");
                            bol=false;
                        }
                        break;
                    case 2:
                        if((anho%4==0&&anho%100!=0)||anho%400==0) {
                            if(dia>29) {
                                JOptionPane.showMessageDialog(null, "Día inválido");
                                bol=false;
                            }
                        }else {
                            if(dia>28) {
                                JOptionPane.showMessageDialog(null, "Día inválido");
                                bol=false;
                            }
                        }
                        break;
                }
            }else {
                JOptionPane.showMessageDialog(null, "Mes inválido");
                bol=false;
            }
        }else {
            JOptionPane.showMessageDialog(null, "Año inválido");
            bol=false;
        }
        if(bol==true) {
            JOptionPane.showMessageDialog(null, "La fecha es correcta");
        }
        return bol;
    }
}
