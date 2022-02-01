package boletin22;

import libreriaroi.Leer;

/**
 * @author Roi Martínez
 */

public class Boletin22 {
    public static void main(String[] args) {
        int var = 0;
        
        int njornada = Leer.inInteger("Nº de jornadas:");
        int nequipo = Leer.inInteger("Nº de equipos:");
        
        int[][] goles = new int[nequipo][njornada+1];
        String[] equipos = new String[nequipo];
        String[] jornadas = new String[njornada+1];
        
        Metodos.crear(goles, equipos, jornadas); 
        
        while (var != 5) {
            var = Leer.inInteger("1. Mostrar \n2. Equipo más goleador por jornada \n3. Equipo más goleador en jornada \n4. Consultas \n5. Salir");
            switch (var) {
                case 1:
                    Metodos.ordenar(goles, equipos);
                    Metodos.mostrar(goles, equipos, jornadas);
                    break;
                case 2:
                    Metodos.mostrarMaxGoleadorJornada(goles, equipos, jornadas);
                    break;
                case 3:
                    Metodos.mostrarMaxGoleador(goles, equipos, jornadas);
                    break;
                case 4:
                    int num = Leer.inInteger("1. Buscar por equipo \n2. Buscar por jornada");
                    switch (num) {
                        case 1:
                            Metodos.consultaEquipos(goles, equipos, jornadas);
                            break;
                        case 2:
                            Metodos.consultaJornada(goles, equipos, jornadas);
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}
