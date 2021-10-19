package boletin4_1;
/**
 * @author Roi Martínez
 */
public class Boletin4 {
    public static void main(String[] args) {
        Libro libro = new Libro("libro1", "autor1", 2010, (short)300);
        libro.setVal(4.3f);
        libro.amosar();
        
        Libro libro2 = new Libro();
        libro2.setTitulo("libro2");
        libro2.setAutor("autor2");
        libro2.setAnho(2018);
        libro2.setNumPag((short)456);
        libro2.setVal(3.9f);
        
        short nPagsl2 = libro2.getNumPag();
        System.out.println("\nNúmero de páginas libro2: "+nPagsl2);
        
        
    }
}
