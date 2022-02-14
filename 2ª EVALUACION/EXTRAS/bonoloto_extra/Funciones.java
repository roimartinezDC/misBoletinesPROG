package bonoloto_extra;

import libreriaroi.Leer;

/**
 * @author Roi Martínez
 */

public class Funciones {
    
    public static void crearBonoloto(int[][] bonoloto) {
        int cont = 1;
        for (int i = 0; i < bonoloto.length; i++) {
            for (int e = 0; e < bonoloto[0].length; e++) {
                bonoloto[i][e] = cont;
                cont++;
            }
        }
    }
    
    public static void mostrarBonoloto(int[][] bonoloto) {
        for (int i = 0; i < bonoloto.length; i++) {
            for (int e = 0; e < bonoloto[0].length; e++) {
                System.out.printf("%2s  ", bonoloto[i][e]);
            }
            System.out.println();
        }
    }
    public static void mostrarSeleccion(int[] seleccion) {
        System.out.printf("\n%-10s", "Seleccion:");
        for (int pos : seleccion) {
            System.out.printf("%4d", pos);
        }
    }
    public static void mostrarPremiado(int[] premiado) {
        System.out.printf("\n%-10s", "Premiados:");
        for (int i = 0; i < premiado.length-1; i++) {
            System.out.printf("%4d", premiado[i]);
        }
        System.out.printf("%5s %d", "C:", premiado[premiado.length-1]);
    }
    
    public static void guardarSeleccion(int[] seleccion) {
        boolean ok;
        for (int i = 0; i < seleccion.length; i++) {
            ok = false;
            seleccion[i] = Leer.inInteger("Num. "+(i+1));
            while (ok == false) {
                if (seleccion[i] > 49 || seleccion[i] < 1) {
                    seleccion[i] = Leer.inInteger("*numero fuera del rango de juego* \nNum. "+(i+1));
                }else {
                    ok = true;
                }
            }
            for (int e = 0; e < i; e++) {
                while (seleccion[i] == seleccion[e]) {
                    seleccion[i] = Leer.inInteger("*numero repetido* \nNum. "+(i+1));
                }
            }
        }
    }
    public static void generarSeleccionAleatoria(int[] seleccion) {
        for (int i = 0; i < seleccion.length; i++) {
            seleccion[i] = (int) Math.round(1+Math.random()*49);
            for (int e = 0; e < (i); e++) {
                while (seleccion[i] == seleccion[e]) {
                    seleccion[i] = (int) Math.round(1+Math.random()*49);
                }
            }
        }
    }
    
    public static void calcularMostrarPremio(int[] seleccion, int[] premiado, int premio) {
        int aciertos = 0;
        boolean complementario = false;
        for (int i = 0; i < seleccion.length; i++) {
            for (int e = 0; e < premiado.length-1; e++) {
                if (seleccion[i] == premiado[e]) {
                    aciertos++;
                    break;
                }
            }
            if (seleccion[i] == premiado[premiado.length-1]) {
                complementario = true;
            }
        }
        
        System.out.println();
        System.out.printf("\n%-10s %d    ", "Aciertos:", aciertos);
        if (aciertos < 3) {
            System.out.print("No has sido premiado");
        } else if (aciertos == 3) {
            System.out.printf("%-9s %d€", "Premio:", 4);
        } else if (aciertos == 4) {
            System.out.printf("%-9s %d€", "Premio:", Math.round(premio*0.33));
        } else if (aciertos == 5 && complementario==false) {
            System.out.printf("%-9s %d€", "Premio:", Math.round(premio*0.45));
        } else if (aciertos == 5 && complementario==true) {
            System.out.printf("(+complementario)  %-9s %d€", "Premio:", Math.round(premio*0.56));
        } else if (aciertos == 6) {
            System.out.printf("%-9s %d€", "Premio:", premio);
        }
        System.out.println("\n");
    }
}
