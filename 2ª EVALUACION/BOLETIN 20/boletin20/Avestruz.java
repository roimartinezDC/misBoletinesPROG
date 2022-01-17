package boletin20;

/**
 * @author Roi Martínez
 */
public class Avestruz extends Aves implements IPodeCaminar {
    @Override
    public void caminar() {
        System.out.println("avestruz - ");
        super.caminar();
    }
}
