package boletin15;

/**
 * @author Roi Martínez
 */

public class Pelicula extends Multimedia{
    private String mainActor;
    private String mainActress;
    
    public Pelicula() {
    }
    public Pelicula(String titulo, String autor, String formato, float duracion, String mainActor, String mainActress) {
        super(titulo, autor, formato, duracion);
        this.mainActor = mainActor;
        this.mainActress = mainActress;
    }
    
    public String getActorPrincipal() {
        return mainActor;
    }
    public String getActrizPrincipal() {
        return mainActress;
    }
    
    @Override
    public String toString() {
        return (super.toString()+"\nActor principal: "+mainActor+"\nActriz principal: "+mainActress);
    }
}
