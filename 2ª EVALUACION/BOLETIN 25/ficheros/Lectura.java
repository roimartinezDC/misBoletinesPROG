package ficheros;

import boletin25.Libro;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import libreriaroi.Leer;

/**
 * @author Roi Martínez
 */

public class Lectura {
    
    public void visualizar(ArrayList<Libro> libreria, File fich) {
        try {
            Lectura.vertirFicheroEnArrayList(libreria, fich);
            for (int i = 0; i < libreria.size(); i++) {
                System.out.println();
                System.out.println("Titulo: "+libreria.get(i).getNombre());
                System.out.println("Autor: "+libreria.get(i).getAutor());
                System.out.println("Precio: "+libreria.get(i).getPrecio()+"€");
                System.out.println("Stock: "+libreria.get(i).getUnidades()+"");
            }
            System.out.println();
            System.out.println("------------------------------------------------\n");
        } catch (FileNotFoundException ex) {
            System.out.println("error3: "+ex.toString());
        }
    }
    
    public void consultar(ArrayList<Libro> libreria, File fich) {
        try {
            Lectura.vertirFicheroEnArrayList(libreria, fich);
            String tit = Leer.inString("Título a buscar: ");
            boolean encontrado = false;
            for (int i = 0; i < libreria.size(); i++) {
                if (libreria.get(i).getNombre().equals(tit)) {
                    if (libreria.get(i).getUnidades() > 0) {
                        System.out.println("Titulo: "+libreria.get(i).getNombre());
                        System.out.println("Precio: "+libreria.get(i).getPrecio());
                    } else {
                        System.out.println("No queda stock de este título");
                    }
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                System.out.println("Este título no se encuentra en la libreria");
            }
            System.out.println();
            
        } catch (FileNotFoundException ex) {
            System.out.println("error2: "+ex.toString());
        }
    }
    
    
    public static void vertirFicheroEnArrayList(ArrayList<Libro> libreria, File fich) throws FileNotFoundException {
        libreria.clear();
        Scanner scan = new Scanner(fich);
        String str;
        while (scan.hasNextLine()) {
            str = scan.nextLine();
            String[]lista = str.split(",");
            libreria.add(new Libro(lista[0], lista[1], Integer.parseInt(lista[2]), Integer.parseInt(lista[3])));
        }
        scan.close();
    }
    
}
 