package boletin33;

public class Boletin33 {
    public static void main(String[] args) {
        Integer[] matriz = {2, 3, 5, 1};
        System.out.println("mayor: "+Operaciones.calcMax(matriz));
        System.out.println("menor: "+Operaciones.calcMin(matriz));
        System.out.println("posicion del 3: "+Operaciones.buscarNum(matriz, 3));
        System.out.println("borrar el 2: "+Operaciones.borrarNum(matriz, 2));
    }
}
