package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
    
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected GregorianCalendar fechaIngreso;
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        return dni + ", " + nombre + " " + apellidos + ", " + fechaIngreso.get(Calendar.YEAR)+" // ";
    }
    
    
    
}
