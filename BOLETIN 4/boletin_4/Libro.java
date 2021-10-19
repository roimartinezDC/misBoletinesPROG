package boletin4_1;
/**
 * @author Roi Martínez
 */
public class Libro {
    //1.Atributos
    private String titulo;
    private String autor;
    private int anho;
    private short numPaginas;
    private float valoracion;
    //2.Constructores
    public Libro(){
    }
    public Libro(String ti, String aut, int an, short numP){
        titulo = ti;
        autor = aut;
        anho = an;
        numPaginas = numP;   
    }
    //3.Métodos de acceso
    public void setTitulo(String tit) {
        titulo = tit;
    }
    public String getTitulo() {
        return titulo;
    }
    
    public void setAutor(String auto) {
        autor = auto;
    }
    public String getAutor() {
        return autor;
    }
    
    public void setAnho(int ano) {
        anho = ano;
    }
    public int getAnho() {
        return anho;
    }
    
    public void setNumPag(short numPag) {
        numPaginas = numPag;
    }
    public short getNumPag() {
        return numPaginas;
    }
    
    public void setVal(float val) {
        valoracion = val;
    }
    public float getVal() {
        return valoracion;
    }
    //4.Metodo amosar
    public void amosar() {
        System.out.println("Título: "+titulo+"\nAutor: "+autor+"\nAño: "+anho+"\nNúmero de páginas: "+numPaginas+"\nValoración: "+valoracion);
    }
    
}
