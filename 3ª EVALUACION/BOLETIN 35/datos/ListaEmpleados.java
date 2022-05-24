package datos;

import entidades.Empleado;
import java.util.ArrayList;

public class ListaEmpleados {
    
    private ArrayList<Empleado> lista;
    private int posicion;
    
    public ListaEmpleados() {
        lista = new ArrayList<>();
        posicion = -1;
    }
    
    public void add(Empleado emp) {
        lista.add(emp);
        posicion++;
    }
    
    public Empleado getEmpleado(int pos) {
        if (pos>=0 && pos<=posicion) {
            return lista.get(pos);
        } else {
            return null;
        }
    }

    public int getPosicion() {
        return posicion;
    }
    
}
