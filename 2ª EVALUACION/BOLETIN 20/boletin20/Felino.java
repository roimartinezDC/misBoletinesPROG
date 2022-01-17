package boletin20;

/**
 * @author Roi Martínez
 */

public class Felino extends Mamifero implements IPodeNadar {
    @Override
    public void caminar() {
        super.caminar();
    }
    @Override
    public void nadar() {
        System.out.println("nada");
    }
}
