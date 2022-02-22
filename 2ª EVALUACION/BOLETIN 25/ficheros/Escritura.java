package ficheros;

import boletin25.Libro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import libreriaroi.Leer;

/**
 * @author Roi Martínez
 */

public class Escritura {
    
    //con BufferedWriter
    BufferedWriter bw; 
    public void añadir(ArrayList<Libro> libreria, File fich) throws IOException {
        try {
            do {
                if (fich.exists()) {
                Lectura.vertirFicheroEnArrayList(libreria, fich);
                } else {
                    bw = new BufferedWriter(new FileWriter(fich));
                    bw.close();
                }
            } while (!fich.exists());
            
            String nombre = Leer.inString("Titulo: ");
            String autor = Leer.inString("Autor: ");
            int precio = Leer.inInteger("Precio: ");
            int unidades = Leer.inInteger("Unidades: ");
            libreria.add(new Libro(nombre, autor, precio, unidades));
            
            bw = new BufferedWriter(new FileWriter(fich));
            for (int i = 0; i < libreria.size(); i++) {
                bw.write(libreria.get(i).getNombre()+","+libreria.get(i).getAutor()+","+libreria.get(i).getPrecio()+","+libreria.get(i).getUnidades()+"\n");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("error1: "+ex.toString());
        } finally {
            bw.close();
        }
    }
    
    //con FileWriter
    FileWriter fichero;
    PrintWriter escritor;
    public void añadir2(File fich) throws IOException {
        try {
            fichero = new FileWriter(fich, true); //true-añadir, false-sobreescribir
            escritor = new PrintWriter(fichero);
            String nombre = Leer.inString("Titulo: ");
            String autor = Leer.inString("Autor: ");
            int precio = Leer.inInteger("Precio: ");
            int unidades = Leer.inInteger("Unidades: ");
            
            escritor.println(nombre+","+autor+","+precio+","+unidades);
            
        } catch (FileNotFoundException ex) {
            System.out.println("error1.2: "+ex.toString());
        } finally {
            fichero.close();
            escritor.close();
        }
    }
    
    public void borrarAgotados(ArrayList<Libro> libreria, File fich) throws IOException {
        try {
            
            Lectura.vertirFicheroEnArrayList(libreria, fich);
            
            for (int i = 0; i < libreria.size(); i++) {
                if (libreria.get(i).getUnidades() == 0) {
                    System.out.println("se ha eliminado: \""+libreria.get(i).getNombre()+"\"");
                    libreria.remove(i);
                    i = i-1;//esto se hace porque al eliminar una posición el arrayList se reordena automáticamente,
                            //por lo que las posiciones superiores a la eliminación bajan un puesto
                            //con esta operación se hace que el contador "i" no aumente siempre que esa posición haya sido borrrada, 
                            //para hacer la comprobación del objeto que bajó con el reorden a la posicón del objeto que acaba de ser eliminado
                }
            }
            System.out.println();
            
            Escritura.escribirArrayListEnFichero(libreria, fich);
            
        } catch (FileNotFoundException ex) {
            System.out.println("error4: "+ex.toString());
        } 
    }
    
    public void modificarPrecio(ArrayList<Libro> libreria, File fich) throws IOException {
        try {
            
            Lectura.vertirFicheroEnArrayList(libreria, fich);
            
            String titulo = Leer.inString("Título a buscar: ");
            boolean encontrado = false;
            for (int i = 0; i < libreria.size(); i++) {
                if (libreria.get(i).getNombre().equals(titulo)) {
                    int nprecio = Leer.inInteger("Nuevo precio: ");
                    libreria.get(i).setPrecio(nprecio);
                    encontrado = true;
                    System.out.println("Precio modificado \n");
                }
            }
            if (encontrado == false) {
                System.out.println("No se ha encontrado ningín libro con ese título \n");
            }
            
            Escritura.escribirArrayListEnFichero(libreria, fich);
            
        } catch (FileNotFoundException ex) {
            System.out.println("error5: "+ex.toString());
        }
    }
    
    
    public static void escribirArrayListEnFichero(ArrayList<Libro> libreria, File fich) throws IOException {
        if (fich.exists()) {
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(fich));
            for (int i = 0; i < libreria.size(); i++) {
                bw2.write(libreria.get(i).getNombre()+","+libreria.get(i).getAutor()+","+libreria.get(i).getPrecio()+","+libreria.get(i).getUnidades()+"\n");
            }
            bw2.close();
        }
    }
}
