package boletin20;

/**
 * @author Roi Martínez
 */

public class Tigre extends Felino {

    @Override
    public void caminar() {
        System.out.print("tigre - ");
        super.caminar();
    }

    @Override
    public void nadar() {
        System.out.print("tigre - ");
        super.nadar();
    }
}
