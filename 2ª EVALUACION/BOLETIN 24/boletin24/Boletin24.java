package boletin24;

/**
 * @author Roi Martínez
 */

import clases.ExcepcionNull;
import clases.Metodos;
import clases.Libro;
import java.util.ArrayList;
import libreriaroi.Leer;

public class Boletin24 {
    public static void main(String[] args) {
        ArrayList<Libro> biblioteca = new ArrayList<>();
        
        int var = 0;
        while (var != 6) {
            var = Leer.inInteger("1. Añadir libro \n2. Vender libro \n3. Mostrar biblioteca \n4. Dar de baja libros sin stock \n5. Buscar libro \n6. Salir");
            switch (var) {
                case 1:
                    Metodos.agregar(biblioteca);
                    break;
                case 2:
                    try {
                        Metodos.vender(biblioteca);
                    } catch (ExcepcionNull ex) {
                        System.out.println("error 1: "+ex.toString());
                    }
                    break;
                case 3:
                    Metodos.ordenar(biblioteca);
                    try {
                        Metodos.mostrar(biblioteca);
                    } catch (ExcepcionNull ex) {
                        System.out.println("error 2: "+ex.toString());
                    }
                    break;
                case 4:
                    try {
                        Metodos.eliminarVacios(biblioteca);
                    } catch (ExcepcionNull ex) {
                        System.out.println("error 3: "+ex.toString());
                    }
                    break;
                case 5:
                    try {
                        Metodos.consultar(biblioteca);
                    } catch (ExcepcionNull ex) {
                        System.out.println("error 4: "+ex.toString());
                    }
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }
        
        
    }
}
