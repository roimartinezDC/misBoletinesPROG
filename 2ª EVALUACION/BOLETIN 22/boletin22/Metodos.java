package boletin22;

import java.util.stream.IntStream;
import libreriaroi.Leer;

/**
 * @author Roi Martínez
 */

public class Metodos {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static void crear(int[][]goles, String[]equipos, String[]jornadas) {
        for (int i = 0; i < jornadas.length-1; i++) {
            jornadas[i] = "X"+(i+1);
        }
        jornadas[jornadas.length-1] = "Total";
                
        /*for (int i = 0; i < equipos.length; i++) {
            equipos[i] = Leer.inString("Nombre equipo "+(i+1)+":");
        }
        */
        
        for (int i = 0; i < goles.length; i++) {
            for (int e = 0; e < goles[i].length-1; e++) {
                goles[i][e] = (int) Math.round(1+Math.random()*9);
            }
        }
        int[] suma = new int[goles.length];
        for (int i = 0; i < goles.length; i++) {
            for (int e = 0; e < goles[i].length-1; e++) {
                suma[i]+= goles[i][e];
            }
        }
        for (int i = 0; i < goles.length; i++) {
            goles[i][goles[i].length-1] = suma[i];
        }
    }
    
    public static void ordenar(int[][]goles, String[]equipos) {
        int[] golesCopia;
        String equiposCopia;
        
        for (int i = 0; i < goles.length; i++) {
            for (int e = i+1; e < goles.length; e++) {
                if (goles[i][goles[0].length-1] > goles[e][goles[0].length-1]) {
                    golesCopia = goles[i];
                    goles[i] = goles[e];
                    goles[e] = golesCopia;
                    
                    equiposCopia = equipos[i];
                    equipos[i] = equipos[e];
                    equipos[e] = equiposCopia;
                }
            }
        }
    }
    
    public static void mostrar(int[][]goles, String[]equipos, String[]jornadas) {
        System.out.println();
        System.out.println();
        System.out.printf("%15s"," ");
        System.out.print("  ");
        for (int i = 0; i < jornadas.length; i++) {
            System.out.printf("%3s    ", jornadas[i]);
        }
        System.out.println();
        for (int i = 0; i < goles.length; i++) {
            System.out.printf("%-15s", equipos[i]);
            System.out.print("  ");
            for (int e = 0; e < goles[i].length-1; e++) {
                System.out.printf("%3s    ", goles[i][e]);
            }
            System.out.printf(" %2s", goles[i][goles[i].length-1]);
            System.out.println();
        }
        System.out.println();
    }
    
    public static void mostrarMaxGoleadorJornada(int[][]goles, String[]equipos, String[]jornadas) {
       System.out.println();
        System.out.printf("%18s"," ");
        System.out.print("   ");
        for (int i = 0; i < jornadas.length; i++) {
            System.out.printf("%3s    ", jornadas[i]);
        }
        System.out.println();
        for (int i = 0; i < goles.length; i++) {
            System.out.printf("%-4d", i+1);
            System.out.printf("%-15.13s", equipos[i]);
            System.out.print("  ");
            for (int e = 0; e < goles[i].length-1; e++) {
                System.out.printf("%3s    ", goles[i][e]);
            }
            System.out.printf(" %2s", goles[i][goles[i].length-1]);
            System.out.println();
        }
        System.out.println();
        System.out.printf("%-19s  ","Más goleador:");
        int masGoles;
        int num = 0;
        for (int e = 0; e < goles[0].length-1; e++) {
            masGoles = 0;
            for (int i = 0; i < goles.length; i++) {
                if (goles[i][e] >= masGoles) {
                    masGoles = goles[i][e];
                    num = i+1;
                }
            }
            System.out.printf("%3d    ", num);
        }
        System.out.println();
    }
    
    public static void mostrarMaxGoleador(int[][]goles, String[]equipos, String[]jornadas) {
        
        int masG = 0;
        for (int i = 0; i < goles.length; i++) {
            for (int e = 0; e < goles[0].length-1; e++) {
                if (goles[i][e] >= masG) {
                    masG = goles[i][e];
                }
            }
        }
        
        System.out.println();
        System.out.printf("%15s"," ");
        System.out.print("  ");
        for (int i = 0; i < jornadas.length; i++) {
            for (int e = 0; e < goles.length; e++) {
                if (goles[e][i] == masG  && i != jornadas.length-1) {
                    System.out.print(ANSI_RED);
                    break;
                }
            }
            System.out.printf("%3s    ", jornadas[i]);
            System.out.print(ANSI_RESET);
        }
        System.out.println();
        
        boolean result; //valor booleano el cual se va a utilizar como condicion en el If
        final int MASG = masG; //la variable tiene que ser final para poder realizar la comparación con el IntStream
        for (int i = 0; i < goles.length; i++) {
            result = IntStream.of(goles[i]).anyMatch(x -> x == MASG); //comparacion con la libreria importada de IntStream
            if (result) {
                System.out.print(ANSI_RED);
            }
            System.out.printf("%-15s", equipos[i]);
            System.out.print("  ");
            System.out.print(ANSI_RESET);
            for (int e = 0; e < goles[i].length-1; e++) {
                if (goles[i][e] == masG) {
                    System.out.print(ANSI_RED);
                    System.out.printf("%3s    ", goles[i][e]);
                    System.out.print(ANSI_RESET);
                } else {
                    System.out.printf("%3s    ", goles[i][e]);
                }
            }
            System.out.printf(" %2s", goles[i][goles[i].length-1]);
            System.out.println();
        }
        System.out.println();
    }
    
    public static void consultaEquipos(int[][]goles, String[]equipos, String[]jornadas) {
        String msg = "";
        for (int i = 0; i < equipos.length; i++) {
            msg += (i+1)+" - "+equipos[i]+"\n";
        }
        int num = Leer.inInteger(msg);
        
        for (int i = 0; i < goles.length; i++) {
            if (i == (num-1)) {
                System.out.println();
                System.out.printf("%15s"," ");
                System.out.print("  ");
                for (int j = 0; j < jornadas.length; j++) {
                    System.out.printf("%3s    ", jornadas[j]);
                }
                System.out.println();
                System.out.printf("%-15s", equipos[i]);
                System.out.print("  ");
                for (int e = 0; e < goles[0].length-1; e++) {
                    System.out.printf("%3s    ", goles[i][e]);
                }
                System.out.printf(" %2s", goles[i][goles[i].length-1]);
                System.out.println();
                break;
            }
        }
        System.out.println();
    }
    
    public static void consultaJornada(int[][]goles, String[]equipos, String[]jornadas) {
        String msg = "";
        for (int i = 0; i < jornadas.length-1; i++) {
            msg += (i+1)+" - Jornada "+(i+1)+"\n";
        }
        msg += jornadas.length+" - Totales ";
                
        int num = Leer.inInteger(msg);
        for (int i = 0; i < goles[0].length; i++) {
            if (i == (num-1)) {
                System.out.println();
                System.out.printf("%15s"," ");
                System.out.print("  ");
                System.out.printf("%3s    ", jornadas[i]);
                
                System.out.println();
                for (int e = 0; e < goles.length; e++) {
                    System.out.printf("%-15s", equipos[e]);
                    System.out.print("  ");
                    System.out.printf("%3s    ", goles[e][i]);
                    System.out.println();
                }
                break;
            }
        }
        System.out.println();
    }
    
}
