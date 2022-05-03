package boletin34;

public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int aniosExperiencia;
    
    public Masajista(String nombre, String apell, int edad, String titul, int anExp) {
        this.cont++;
        this.id = cont;
        this.nombre = nombre;
        this.apellidos = apell;
        this.edad = edad;
        this.titulacion = titul;
        this.aniosExperiencia = anExp;
    }
    
    public void darMasaje() {
        
    }
    
    @Override
    public void concentrarse() {
        System.out.println("se concentra el masajista");
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
        return super.toString()+"Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    
}
