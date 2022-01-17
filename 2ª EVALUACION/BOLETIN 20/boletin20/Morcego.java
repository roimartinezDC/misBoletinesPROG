package boletin20;

/**
 * @author Roi Martínez
 */

public class Morcego extends Mamifero implements IPodeVoar {
    @Override
    public void caminar() {
        System.out.print("morcego - ");
        super.caminar();
    }
    @Override
    public void voar() {
        System.out.println("morcego - voa");
    }
}
