package boletin.pkg2.extra;
/**
 * @author Roi Martínez
 */
public class Conta {
    private String nomCliente;
    private String nCuenta;
    private double tipoInteres;
    private double saldo;
    
    public Conta() {
    }
    public Conta(String nClient, String nCuent, double tInter, double sald) {
        nomCliente = nClient;
        nCuenta = nCuent;
        tipoInteres = tInter;
        saldo = sald;
    }
    
    public void setNombre(String nombre) {
        nomCliente = nombre;
    }
    public String getNombre() {
        return nomCliente;
    }
    public void setNcuenta(String cuenta) {
        nCuenta = cuenta;
    }
    public String getNcuenta() {
        return nCuenta;
    }
    public void setTipInteres(double interes) {
        tipoInteres = interes;
    }
    public double getTipInteres() {
        return tipoInteres;
    }
    public void setSaldo(double sald0) {
        saldo = sald0;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public void ingreso(double cant) {
        saldo += cant;
    }
    public void reintegro(double cant) {
        if(saldo-cant >= 0) {
            saldo -= cant;
        }else {
            System.out.println("No tienes fondos suficientes para retirar esta cantidad");
        }
    }
    
    public void transferencia(Conta cuentaDestino, double importe) {
        if(saldo-importe >= 0) {
            saldo -= importe;
            cuentaDestino.ingreso(importe);
        }else {
            System.out.println("No tienes fondos suficientes para hacer esta transacción");
        }
    }
    
    
}
