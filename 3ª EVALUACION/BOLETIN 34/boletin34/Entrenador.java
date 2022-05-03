package boletin34;

public class Entrenador extends SeleccionFutbol {
    
    private int idFederacion;
    private static int cont2 = 0;
    
    public Entrenador(String nombre, String apell, int edad) {
        this.cont++;
        cont2++;
        this.id = cont;
        this.idFederacion = cont2;
        this.nombre = nombre;
        this.apellidos = apell;
        this.edad = edad;
    }
    
    public void planificarEntrenamiento() {
        
    }
    
    @Override
    public void concentrarse() {
        System.out.println("concentrase o entrenador");
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
        return super.toString()+"Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    
}
