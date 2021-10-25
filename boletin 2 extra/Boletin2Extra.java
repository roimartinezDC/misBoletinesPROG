package boletin.pkg2.extra;
/**
 * @author Roi Martínez
 */
public class Boletin2Extra {
    public static void main(String[] args) {
        Conta cuenta1 = new Conta("Roi", "12345JN", 1.23, 500.45);
        Conta cuenta2 = new Conta("Roi2", "23418SK", 1.23, 70.00);
        
        System.out.println("Saldo cuenta  "+cuenta1.getNcuenta()+": "+cuenta1.getSaldo()+"\nSaldo cuenta  "+cuenta2.getNcuenta()+": "+cuenta2.getSaldo());
        final double TRANS = 20;
        cuenta1.transferencia(cuenta2, TRANS);
        System.out.println("*realizada transferencia de "+TRANS+"*");
        System.out.println("Saldo cuenta  "+cuenta1.getNcuenta()+": "+cuenta1.getSaldo()+"\nSaldo cuenta  "+cuenta2.getNcuenta()+": "+cuenta2.getSaldo());
        
        System.out.println("\nSaldo cuenta  "+cuenta1.getNcuenta()+": "+cuenta1.getSaldo());
        final double REINT = 5.23;
        cuenta1.reintegro(REINT);
        System.out.println("*realizado reintegro de "+REINT+"*");
        System.out.println("Saldo cuenta  "+cuenta1.getNcuenta()+": "+cuenta1.getSaldo());
        
        
    }
}
