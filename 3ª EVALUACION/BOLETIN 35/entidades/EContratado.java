package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EContratado extends Empleado {
    
    private double sueldoBase;
    private int porcentajeAdc;
    
    public EContratado(String dni, String nombre, String apellidos, GregorianCalendar fechIng, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIngreso = fechIng;
        this.sueldoBase = sueldo;
        
        Calendar fechaLocal = Calendar.getInstance();
        if (fechaLocal.get(Calendar.YEAR) - fechaIngreso.get(Calendar.YEAR) < 4) {
            this.porcentajeAdc = 5;
        } else if (fechaLocal.get(Calendar.YEAR) - fechaIngreso.get(Calendar.YEAR) < 8) {
            this.porcentajeAdc = 10;
        } else if (fechaLocal.get(Calendar.YEAR) - fechaIngreso.get(Calendar.YEAR) <= 15) {
            this.porcentajeAdc = 15;
        } else {
            this.porcentajeAdc = 20;
        }
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getPorcentajeAdc() {
        return porcentajeAdc;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return super.toString() + "sueldo: " + sueldoBase + "€ , porcentaje: " + porcentajeAdc+"%";
    }
    
    
    
}
