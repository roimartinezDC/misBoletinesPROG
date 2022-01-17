package boletin20;

/**
 * @author Roi Martínez
 */

public class Aves implements IPodeVoar, IPodeCaminar {
    @Override
    public void voar() {
        System.out.println("voa");
    }
    @Override
    public void caminar() {
        System.out.println("camina");
    }
}
