package boletin34;

public class Seleccionador extends SeleccionFutbol {
    
    public Seleccionador(String nombre, String apel, int edad) {
        this.cont++;
        this.id = cont;
        this.nombre = nombre;
        this.apellidos = apel;
        this.edad = edad;
    }
    
    public void seleccionarXogador() {
        
    }
    
    @Override
    public void concentrarse() {
        System.out.println("se concentra el seleccionador");
    }

    @Override
    public void viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jugarPartido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
