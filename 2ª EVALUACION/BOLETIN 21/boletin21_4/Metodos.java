package boletin21_4;

/**
 * @author Roi Martínez
 */

public class Metodos {
    public static char calcularLetraDNI(int numeros) {
        char letra = 'ñ';
        int resto = numeros % 23;
        
        switch (resto) {
            case 3:
                letra = 'A';
                break;
            case 11:
                letra = 'B';
                break;
            case 20:
                letra = 'C';
                break;
            case 9:
                letra = 'D';
                break;
            case 22:
                letra = 'E';
                break;
            case 7:
                letra = 'F';
                break;
            case 4:
                letra = 'G';
                break;
            case 18:
                letra = 'H';
                break;
            case 13:
                letra = 'J';
                break;
            case 21:
                letra = 'K';
                break;
            case 19:
                letra = 'L';
                break;
            case 5:
                letra = 'M';
                break;
            case 12:
                letra = 'N';
                break;
            case 8:
                letra = 'P';
                break;
            case 16:
                letra = 'Q';
                break;
            case 1:
                letra = 'R';
                break;
            case 15:
                letra = 'S';
                break;
            case 0:
                letra = 'T';
                break;
            case 17:
                letra = 'V';
                break;
            case 2:
                letra = 'W';
                break;
            case 10:
                letra = 'X';
                break;
            case 6:
                letra = 'Y';
                break;
            case 14: 
                letra = 'Z';
                break;
            default:
                break;
        }
        
        return letra;
    }
}
