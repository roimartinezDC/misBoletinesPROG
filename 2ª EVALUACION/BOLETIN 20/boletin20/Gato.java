package boletin20;

/**
 * @author Roi Martínez
 */

public class Gato extends Felino {
    @Override
    public void caminar() {
        System.out.print("gato - ");
        super.caminar(); 
    }
    @Override
    public void nadar() {
        System.out.print("gato - ");
        super.nadar();
    }
}
