package presentacion;

import entidades.*;
import datos.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Aplicacion {
    public static void main(String[] args) {
        ListaEmpleados listaEmp = new ListaEmpleados();
        int var = 0;
        while (var != 4) {
            String dni, nombre, apellidos;
            GregorianCalendar fechaIngreso;
                    
            var = Integer.parseInt(pDat("1. Añadir Empleado Contratado \n2. Añadir Empleado Destajo \n3. Ver empleados \n4. Salir"));
            switch (var) {
                case 1:
                    dni = pDat("DNI:");
                    nombre = pDat("Nombre:");
                    apellidos = pDat("Apellidos:");
                    fechaIngreso = new GregorianCalendar(Integer.parseInt(pDat("Año de ingreso:")), 1, 1);
                    double sueldo = Double.parseDouble(pDat("Sueldo base:"));
                    listaEmp.add(new EContratado(dni, nombre, apellidos, fechaIngreso, sueldo));
                    break;
                    
                case 2:
                    dni = pDat("DNI:");
                    nombre = pDat("Nombre:");
                    apellidos = pDat("Apellidos:");
                    fechaIngreso = new GregorianCalendar(Integer.parseInt(pDat("Año de ingreso:")), 1, 1);
                    int clientesAsc = Integer.parseInt(pDat("Nº clientes captados:"));
                    int complementoCL = Integer.parseInt(pDat("Complemento por cliente:"));
                    listaEmp.add(new EDestajo(dni, nombre, apellidos, fechaIngreso, clientesAsc, complementoCL));
                    break;
                    
                case 3:
                    String str = "";
                    for (int i = 0; i <= listaEmp.getPosicion(); i++) {
                        str += listaEmp.getEmpleado(i).toString()+"\n";
                    }
                    mostrar(str);
                    break;
                    
                case 4:
                    break;
                    
                default:
                    break;
            }
        }
        
        
    }
    
    private static String pDat(String msg) {
        return JOptionPane.showInputDialog(msg);
    }
    private static void mostrar(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}