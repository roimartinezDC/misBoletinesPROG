package boletin20;

/**
 * @author Roi Martínez
 */

public class Boletin20 {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Papagaio papagaio = new Papagaio();
        Avestruz avestruz = new Avestruz();
        Morcego morcego = new Morcego();
        Tigre tigre = new Tigre();
        
        gato.caminar();
        gato.nadar();
        papagaio.caminar();
        papagaio.voar();
        avestruz.caminar();
        morcego.caminar();
        morcego.voar();
        tigre.caminar();
        tigre.nadar();
    }
}
