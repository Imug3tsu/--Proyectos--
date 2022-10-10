
package Bibloteca;

public class GitHub2 {
    static AplicarMetodos metodo=new AplicarMetodos();
    static Bibloteca bib[]=new Bibloteca[2];
    static Libros libro[]=new Libros[4];
    
    /**
     * No ejecutar todos los metodos, si quieres ver el mayor o menor precio de los libros
     * ejecuta los 3 primeros, si quieres ver otras funciones de este ejercicio
     * ejecuta (crear_libro) y (menu_inicio).
     * @param args 
     */
    public static void main(String[] args) {
        
        metodo.crear_libro(bib, libro);
        //metodo.libro_mayor_precio(bib, libro);
        //metodo.libro_menor_precio(bib, libro);
        metodo.menu_inicio(bib, libro);
    }
    
}
