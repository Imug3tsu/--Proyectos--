
package Persona1;

import java.util.ArrayList;
import java.util.List;

public class AplicarMetodos {
    static Persona p[]=new Persona[3];
    static Animal a[]=new Animal[3];
    static Fruta f[]=new Fruta[3];
    static List<Object> lista=new ArrayList<>();
    static List<Object> lista2=new ArrayList<>();
    
    /**
     * Creamos las personas, animales, frutas.
     * @param p
     * @param a
     * @param f 
     */
    public void crear_objetos(Persona p[],Animal a[],Fruta f[]){
        p[0]=new Persona("Juan","Arce",16,'m');
        p[1]=new Persona("Mel","Gusto",16,'f');
        p[2]=new Persona("Luci","Guzman",16,'f');
        
        a[0]=new Animal("Perro","Blanco",2);
        a[1]=new Animal("Gato","Amarillo",1);
        a[2]=new Animal("Caballo","Marron",3);
        
        f[0]=new Fruta("Manzana","Verde");
        f[1]=new Fruta("Pera","Amarillo");
        f[2]=new Fruta("Sandia","Verde");
    }
    
    /**
     * Agregamos a todos los objetos antes creados a una lista.
     * @param lista
     * @param p
     * @param a
     * @param f 
     */
    public void agregar_lista(List lista,Persona p[],Animal a[],Fruta f[]){
        int i=0;
        for (i=0;i<p.length;i++){
            lista.add(p[i]);
        }
        
        for (i=0;i<a.length;i++){
            lista.add(a[i]);
        }
        
        for (i=0;i<f.length;i++){
            lista.add(f[i]);
        }
    }
    
    /**
     * Este metodo cumple la funcion de verificar si el objeto que nosotros le asignemos
     * a analizar, pertence a la clase (Persona), caso contrario, mostrara un mensaje diciendo
     * que no es una persona.
     * @param obj 
     */
    public void verificacion_objeto(Object obj[]){
        int i=0;
        for (i=0;i<obj.length;i++){
            if (obj[i] instanceof Persona){
                System.out.println("(Correcto solo personas)");
                for (i=0;i<obj.length;i++){
                    System.out.println("Personas: "+((Persona)obj[i]).getNombre()+" "+((Persona)obj[i]).getApellido());
                }
                break;      
            }
            else if (obj[i] instanceof Animal){
                System.out.println("(No es una persona)");
                for (i=0;i<obj.length;i++){
                    System.out.println("Animal: "+((Animal)obj[i]).getTipo());
                }
                break;
            }
            else if (obj[i] instanceof Fruta){
                System.out.println("(No es una persona)");
                for (i=0;i<obj.length;i++){
                    System.out.println("Fruta: "+((Fruta)obj[i]).getFruta());
                }
                break;
            }
        }
    }
    
    /**
     * Muestra los objetos persona, animal, fruta ya creados.
     * @param p
     * @param a
     * @param f 
     */
    public void mostrar_objetos(Persona p[],Animal a[],Fruta f[]){
        int i=0;
        System.out.println("\n\t..::PERSONA::..");
        for (i=0;i<p.length;i++){
        System.out.println("Nombre: "+p[i].getNombre());
        System.out.println("Apellido: "+p[i].getApellido());
        System.out.println("Edad: "+p[i].getEdad());
        System.out.println("Sexo: "+p[i].getSexo());
        System.out.println("");
        }
        
        System.out.println("\n\t..::ANIMAL::..");
        for(i=0;i<a.length;i++){
            System.out.println("Tipo: "+a[i].getTipo());
            System.out.println("Color: "+a[i].getColor());
            System.out.println("Años: "+a[i].getAños());
            System.out.println("");
        }
        
        System.out.println("\n\t..::FRUTA::..");
        for(i=0;i<f.length;i++){
            System.out.println("Fruta: "+f[i].getFruta());
            System.out.println("Color: "+f[i].getColor());
            System.out.println("");
        }
    }
    
    /**
     * Este metodo servira de verificacion si en verdad la Clase (Persona) pertence a esta misma.
     * Esta lista solo agregara la clase (Persona).
     * @param lista2
     * @param p 
     */
    public void agregar_lista_persona(List lista2,Persona p[]){
        for (int i=0;i<p.length;i++){
            lista2.add(p[i]);
        }
    }
    
    /**
     * Este metodo verificara si la lista antes creada que contiene solo la clase (Persona),
     * pertence a esta misma.
     * @param lista2 
     */
    public void verifiacion_lista_persona(List lista2){
        for(Object mostrar:lista2){
            if (mostrar instanceof Persona){
                System.out.println("Correcto solo personas");
                break;
            }else{
                System.out.println("Hay otros objetos que no son personas");
                break;
            }
        }
    }
    
}
