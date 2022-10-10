
package Persona1;

import java.util.ArrayList;
import java.util.List;

/*
Ejecicio de verificacion de clases con (instanceof) y listas.
*/

public class Main {
    static AplicarMetodos metodo=new AplicarMetodos();
    static Persona p[]=new Persona[3];
    static Animal a[]=new Animal[3];
    static Fruta f[]=new Fruta[3];
    static List<Object> lista=new ArrayList<>();
    static List<Object> lista2=new ArrayList<>();
    
    /**
     * Recomiendo ejecutar los 3 primeros metodos y luego los demas,
     * uno en uno, dependiendo de la funcion, es decir, si ya mostraste
     * los resultados de las clases, comentala, para no perderte en
     * los siguientes metodos.
     * @param args 
     */
    public static void main(String[] args) {
        
        metodo.crear_objetos(p, a, f);
        //metodo.agregar_lista(lista, p, a, f);
        //metodo.mostrar_objetos(p, a, f);
        //metodo.verificacion_objeto(f);
        
        //metodo.agregar_lista_persona(lista2, p);
        //metodo.verifiacion_lista_persona(lista2);
    }
}
