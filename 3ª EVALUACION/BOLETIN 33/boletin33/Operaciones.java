package boletin33;

public class Operaciones {
    public static double cambiante;
    
    public static <T> double calcMin(T[] array) {
        double res = 0;
        try {
            double menor =  Double.parseDouble(array[0].toString());
            for (int i = 0; i < array.length; i ++) {
                try {
                    cambiante = Double.parseDouble(array[i].toString());
                    if (cambiante < menor) {
                        menor = cambiante;
                    }
                } catch (Exception e) {
                    System.out.println("No se puede comparar");
                    menor = 0;
                    break;
                }
            }
            res = menor;
        } catch (Exception e) {
            System.out.println("No se puede comparar");
        }
        return res;
    }
    
    public static <T> double calcMax(T[] array) {
        double res = 0;
        try {
            double mayor =  Double.parseDouble(array[0].toString());
            for (int i = 0; i < array.length; i ++) {
                try {
                    cambiante = Double.parseDouble(array[i].toString());
                    if (cambiante > mayor) {
                        mayor = cambiante;
                    }
                } catch (Exception e) {
                    System.out.println("No se puede comparar");
                    mayor = 0;
                    break;
                }
            }
            res = mayor;
        } catch (Exception e) {
            System.out.println("No se puede comparar");
        }
        return res;
    }
    
    public static <T> int buscarNum(T[] array, T obj) {
        int res = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(obj)) {
                res = i;
            }
        }
        return res;
    } 
    
    public static <T> String borrarNum(T[] array, T obj) {
        String res = "-1";
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(obj)) {
                res = obj.toString();
                array[i] = null;
                break;
            }
        }
        return res;
    } 
}
