package boletin6_2;
/**
 * @author Roi Martínez
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite() {
        meridiano = paralelo = distanciaTerra = 0;
    }
    public Satelite ( double m, double p, double d ) {
        meridiano = m ;
        paralelo = p;
        distanciaTerra = d ;
    }
    
    public void verPosicion () {
    System.out.println ("O satélite atópase no paralelo "+ paralelo + ", meridiano " + meridiano +", e a unha distancia da terra de " + distanciaTerra+"km" );
    }
}
