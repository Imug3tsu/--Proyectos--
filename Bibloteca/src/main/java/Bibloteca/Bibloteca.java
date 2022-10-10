
package Bibloteca;

public class Bibloteca {
    private String nombre;
    private Libros listaLibro[]=new Libros[4];
    private int numCount=0;

    
    public Bibloteca(String nombre) {
        this.nombre = nombre;
    }
    
    public Bibloteca(Libros lista[]) {
        this.listaLibro = lista;
        numCount=lista.length;
    }
    
    public void ingresarLibro(Libros libros){
        listaLibro[numCount]=libros;
        numCount++;
    }
    
    public Libros getLibro(int i){
        return listaLibro[i];
    }
    
    public String getNombre() {
        return nombre;
    }

    public Libros[] getListaLibro() {
        return listaLibro;
    }
    
}
