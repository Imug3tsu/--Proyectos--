
package Escuela;

import java.util.ArrayList;
import java.util.List;

/*
Ejercicio de Escuela, con aulas, profesores, alumnos, etc.
*/

public class Nuevo {
    static AplicarMetodos metodo=new AplicarMetodos();
    static List<Aula> listaA=new ArrayList<>();
    static List<Alumno> listaAL=new ArrayList<>();
    static List<Profesor> listaP=new ArrayList<>();
    
    public static void main(String[] args) {
        /*
        Recomiendo probar cada metodo de uno en uno para no perder
        el seguimiento.
        Es decir primero creamos las aulas, profesores e alumnos y
        luego metodo por metodo.
        */
        
        metodo.crear_aula(listaA);
        metodo.crear_profesor(listaP);
        metodo.crear_alumno(listaAL);
        //metodo.mostrar_aulas(listaA);
        //metodo.mostrar_profesores(listaP);
        //metodo.mostrar_alumnos(listaAL);
        //metodo.profesor_materia(listaP);
        //metodo.alumno_aprobado(listaAL);
        //metodo.mostrar_alumnos(listaAL);
        //metodo.alumno_default(listaAL);
        //System.out.println("--------------ALUMNO DEFAULT---------------");
        //metodo.mostrar_alumnos(listaAL);
        //metodo.aula_profesor(listaP, listaA);
    }
}
