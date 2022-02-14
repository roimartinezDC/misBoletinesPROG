package boletinextra5;

/**
 * @author Roi Martínez
 */

public class Docente {
    private String codigo;
    private String nombre;
    /*
    * Para la categoría:
    * 1 = Principal
    * 2 = Asociado
    * 3 = Auxiliar
    */
    private int categoria;
    /*
    * Para estudios:
    * 1 = Doctorado
    * 2 = Maestría
    * 3 = Ambas
    */
    private int estudios;
    private int antiguedad;
    private int horasClase;
    private double sueldoBruto;
    private int bonifEstudios = 0;
    private int bonifAntiguedad = 0;
    private final int DESCAFP = 13;
    private final int DESCSEGSAL = 5;
    private double sueldoNeto;
    
    public Docente() {
    }
    
    public void setCodigo(String cod) {
        codigo = cod;
    }
    public void setNombre(String nom) {
        nombre = nom;
    }
    public void setCategoria(int cat) {
        categoria = cat;
    }
    public void setEstudios(int est) {
        estudios = est;
    }
    public void setAntiguedad(int ant) {
        antiguedad = ant;
    }
    public void setHorasClase(int horas) {
        horasClase = horas;
    }
    
    public double pagoParcial() {
        double pago = 0;
        switch (categoria) {
            case 1:
                pago = horasClase * 25;
                break;
            case 2:
                pago = horasClase * 18;
                break;
            case 3:
                pago = horasClase * 15;
                break;
            default:
                break;
        }
        return pago;
    }
    
    public double salarioBruto() {
        double pagoParcial = pagoParcial();
        
        switch (estudios) {
            case 1:
                switch (categoria) {
                    case 1:
                        bonifEstudios = 20;
                        break;
                    case 2:
                        bonifEstudios = 15;
                        break;
                    case 3:
                        bonifEstudios = 12;
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (categoria) {
                    case 1:
                        bonifEstudios = 17;
                        break;
                    case 2:
                        bonifEstudios = 10;
                        break;
                    case 3:
                        bonifEstudios = 8;
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (categoria) {
                    case 1:
                        bonifEstudios = 25;
                        break;
                    case 2:
                        bonifEstudios = 20;
                        break;
                    case 3:
                        bonifEstudios = 2;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        
        if (antiguedad >= 8) {
            switch (categoria) {
                case 1:
                    bonifAntiguedad = 7;
                    break;
                case 2:
                    bonifAntiguedad = 6;
                    break;
                case 3:
                    bonifAntiguedad = 5;
                    break;
                default:
                    break;
            }
        }else if (antiguedad > 7) {
            switch (categoria) {
                case 1:
                    bonifAntiguedad = 5;
                    break;
                case 2:
                    bonifAntiguedad = 4;
                    break;
                case 3:
                    bonifAntiguedad = 2;
                    break;
                default:
                    break;
            }
        }
        
        double bonificacionEst = pagoParcial * bonifEstudios / 100;
        double bonificacionAnt = pagoParcial * bonifAntiguedad / 100;
        
        sueldoBruto = pagoParcial + bonificacionEst + bonificacionAnt;
        
        return sueldoBruto;
    }
    
    public double salarioNeto() {
        sueldoBruto = salarioBruto();
        double descuentoAfp = sueldoBruto*DESCAFP/100;
        double descuentoSs = sueldoBruto*DESCSEGSAL/100;
        
        sueldoNeto = sueldoBruto-descuentoAfp-descuentoSs;
        
        return sueldoNeto;
    }
}
