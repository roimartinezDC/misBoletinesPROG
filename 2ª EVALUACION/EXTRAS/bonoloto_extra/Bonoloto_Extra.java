package bonoloto_extra;

import libreriaroi.Leer;

/**
 * @author Roi Martínez
 */

public class Bonoloto_Extra {
    public static void main(String[] args) {
        int[][] bonoloto = new int[7][7];
        int[] seleccion = new int[6];
        int[] premiado = new int[7];
        int premio = 100;
        
        Funciones.crearBonoloto(bonoloto);
        Funciones.mostrarBonoloto(bonoloto);
        
        int var = 0;
        while (var != 3) {
            var = Leer.inInteger("1. Jugar selección \n2. Jugar aleatorios \n3. Salir");
            switch (var) {
                case 1:
                    Funciones.guardarSeleccion(seleccion);
                    Funciones.mostrarSeleccion(seleccion);
                    Funciones.generarSeleccionAleatoria(premiado);
                    Funciones.mostrarPremiado(premiado);
                    Funciones.calcularMostrarPremio(seleccion, premiado, premio);
                    break;
                case 2:
                    Funciones.generarSeleccionAleatoria(seleccion);
                    Funciones.mostrarSeleccion(seleccion);
                    Funciones.generarSeleccionAleatoria(premiado);
                    Funciones.mostrarPremiado(premiado);
                    Funciones.calcularMostrarPremio(seleccion, premiado, premio);
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
}
