package boletin12;

/**
 * @author Roi Martínez
 */

import javax.swing.*;

public class Garaje {
    
    //máximo de plazas
    private final int MAXPLAZAS = 5;
    private int plazasOcupadas = 0;
    //precio aplicado durante el tiempo inicial
    private final float PRECIOINICIAL = 1.5f;
    //tiempo en el que se aplica el precio inicial (en minutos)
    private final float MINUTOSPINICIAL = 180;
    //precio por cada hora que supere el tiempo inicial
    private final float PRECIOHORA = 0.20f;
    //matriz de coches
    Coche coches[] = new Coche[MAXPLAZAS];
    
    public Garaje() {
    }
    
    public void registrarCoche() {
        if (plazasOcupadas>=MAXPLAZAS) {
            JOptionPane.showMessageDialog(null, "COMPLETO");
        }else {
            String matricula = JOptionPane.showInputDialog("PLAZAS DISPONIBLES \nIntroduzca la matrícula del coche:");
            int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tiempo que va a estar aparcado (en minutos) : "));
            //bucle para que recorre toda la matriz de coches
            for (int i = 0; i < coches.length; i++) {
                //se crea el objeto Coche en la primera posición vacía de la matriz
                if (coches[i] == null) {
                    coches[i] = new Coche(matricula, tiempo);
                    plazasOcupadas++;
                    break;
                }
            }
        }
    }
    
    public void retirarCoche() {
        String matricula = JOptionPane.showInputDialog("Introduzca la matrícula de su coche:");
        String matriculaObj;
        boolean encontrado = false;
        
        for (int i = 0; i < plazasOcupadas; i++) {
            //obtener la matrícula de cada vehículo para hacer la comparación
            matriculaObj = coches[i].getMatricula();
            
            //comparación de matrículas
            if (matriculaObj.equals(matricula)) {
                //obtener tiempo específico del vehículo
                int tiempo = coches[i].getTiempo();
                
                //caluclar la deuda
                double deuda;
                if (tiempo<=MINUTOSPINICIAL) {
                    deuda = PRECIOINICIAL;
                }else {
                    double tiempoExtra = tiempo-MINUTOSPINICIAL;
                    //redondeo con floor para que solo contabilicen en el tiempo extra las horas naturales independientemente de los minutos
                    //se redondea con round y * y / por 100 para que devuelva un numero con dos decimales, ya que floor solo trabaja con decimal
                    tiempoExtra = Math.round(Math.floor(tiempoExtra/60)*100.0)/100.0;
                    deuda= Math.round((PRECIOINICIAL + tiempoExtra*PRECIOHORA)*100.0)/100.0;
                }
                
                //pedimos el pago de la deuda
                float pagado = Float.parseFloat(JOptionPane.showInputDialog("Tiene que pagar "+deuda+" €, ingrese la cantidad del pago :"));
                
                //mientras el pago sea menor a la deuda se sigue pidiendo
                while(pagado<deuda) {
                    pagado = Float.parseFloat(JOptionPane.showInputDialog("Cantidad introducida no válida, vuelva a introducir su pago : "));
                }
                
                //cálculo de la vuelta 
                double devuelto = Math.round((pagado - deuda)*100.0)/100.0;
                
                //emisión de la factura
                JOptionPane.showMessageDialog(null, "FACTURA \nMATRICULA COCHE: "+matricula+"\nTIEMPO: "+tiempo+" min\nPERECIO: "+deuda+" €\nDINERO RECIBIDO: "+pagado+" €\nDINERO DEVUELTO: "+devuelto+" €\n\nGRACIAS POR USAR NUESTRO APARCAMIENTO");
                
                //modificamos el nº de coches aparcados
                plazasOcupadas--;
                
                //"eliminamos" el objeto de su posición en la matriz
                coches[i] = null;
                
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, su coche no se encuentra aparcado aquí");
        }
    }
    
    public void numeroCoches() {
        JOptionPane.showMessageDialog(null, "Coches aparcados: "+plazasOcupadas+"/"+MAXPLAZAS);
    }
    
    
}
