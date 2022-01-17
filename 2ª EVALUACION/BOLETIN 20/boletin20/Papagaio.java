package boletin20;

/**
 * @author Roi Martínez
 */

public class Papagaio extends Aves implements IPodeCaminar {
    @Override
    public void voar() {
        System.out.print("papagaio - ");
        super.voar(); 
    }
    
    @Override
    public void caminar() {
        System.out.print("papagaio - ");
        super.caminar();
    }
}
