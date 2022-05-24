package entidades;

import java.util.GregorianCalendar;

public class EDestajo extends Empleado {
    
    private int nClientes;
    private int complementoCl;
    
    public EDestajo(String dni, String nombre, String apellido, GregorianCalendar fechIn, int nc, int compl) {
        this.dni = dni;
        this.nombre= nombre;
        this.apellidos= apellido;
        this.fechaIngreso = fechIn;
        this.nClientes = nc;
        this.complementoCl = compl;
    }

    public int getnClientes() {
        return nClientes;
    }

    public void setnClientes(int nClientes) {
        this.nClientes = nClientes;
    }

    public int getComplementoCl() {
        return complementoCl;
    }

    public void setComplementoCl(int complementoCl) {
        this.complementoCl = complementoCl;
    }

    @Override
    public String toString() {
        return super.toString()+ "clientes asociados: " + nClientes + ", complementoXcliente: " + complementoCl + '€';
    }
    
    
}
