package boletin7_4;
/**
 *
 * @author Roi Martínez
 */
public class Persona {
    private String nombre;
    private double peso;
    
    public Persona(){
    }
    public Persona(String nom, double pes) {
        nombre = nom;
        peso = pes;
    }
    
    public void pesos(Persona pers1, Persona pers2) {
        double pMayor;
        double pMenor;
        double diferencia;
        if(pers1.peso > pers2.peso) {
            System.out.println("Pesa más :\n"+pers1.nombre+", con "+pers1.peso+"kg");
            pMayor = pers1.peso;
            pMenor = pers2.peso;
        }else if(pers2.peso > pers1.peso) {
            System.out.println("Pesa más :\n"+pers2.nombre+", con "+pers2.peso+"kg");
            pMayor = pers2.peso;
            pMenor = pers1.peso;
        }else {
            pMayor = pers1.peso;
            pMenor = pers2.peso;
        }
        diferencia = pMayor-pMenor;
        System.out.println("La diferencia de pesos es de : "+diferencia+"kg");
    }
}
