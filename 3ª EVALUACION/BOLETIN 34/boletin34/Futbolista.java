package boletin34;

public class Futbolista extends SeleccionFutbol {
    
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(String nombre, String apell, int edad, int dorsal, String demarc) {
        this.cont++;
        this.id = cont;
        this.nombre = nombre;
        this.apellidos = apell;
        this.edad = edad;
        this.dorsal = dorsal;
        this.demarcacion = demarc;
    }
    
    public void entrevista() {
        
    }
    
    @Override
    public void concentrarse() {
        System.out.println("concentrase o futbolista");
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
        return super.toString()+"Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
    
}
