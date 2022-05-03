package boletin34;

import java.util.ArrayList;

public class Boletin34 {
    public static void main(String[] args) {
        
        ArrayList<SeleccionFutbol> seleccion = new ArrayList<>();
        seleccion.add(new Futbolista("Pedro", "Gimenez Alonso", 23, 10, "delantero"));
        seleccion.add(new Entrenador("Alberto", "Pérez", 56));
        seleccion.add(new Masajista("Luis", "Pena", 34, "masajista titulado", 10));
        seleccion.add(new Seleccionador("Vicente", "del Bosque", 60));
        
        for (int i = 0; i < seleccion.size(); i++) {
            System.out.println(seleccion.get(i).toString());
            System.out.println();
        }
    }
}
