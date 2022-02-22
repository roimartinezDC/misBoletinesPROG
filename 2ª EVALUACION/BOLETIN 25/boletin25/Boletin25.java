package boletin25;

import ficheros.Escritura;
import ficheros.Lectura;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import libreriaroi.Leer;

/**
 * @author Roi Martínez
 */

public class Boletin25 {
    public static void main(String[] args) throws IOException {
        Lectura lector = new Lectura();
        Escritura escritor = new Escritura();
        ArrayList<Libro> libreria = new ArrayList<>();
        File fich = new File(".\\libreria.txt");
        
        int var = 0;
        while (var != 6) {
            var = Leer.inInteger("1. Añadir \n2. Consultar \n3. Visualizar \n4. Eliminar agotados \n5. Modificar precio \n6. Salir");
            switch (var) {
                case 1:
                    escritor.añadir(libreria, fich);
                    break;
                case 2:
                    lector.consultar(libreria, fich);
                    break;
                case 3:
                    lector.visualizar(libreria, fich);
                    break;
                case 4:
                    escritor.borrarAgotados(libreria, fich);
                    break;
                case 5:
                    escritor.modificarPrecio(libreria, fich);
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }
    }
}
