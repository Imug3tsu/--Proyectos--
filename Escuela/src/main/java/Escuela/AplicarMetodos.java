
package Escuela;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicarMetodos {
    static List<Aula> listaA=new ArrayList<>();
    static List<Alumno> listaAL=new ArrayList<>();
    static List<Profesor> listaP=new ArrayList<>();
    static Scanner entrada=new Scanner(System.in);
    
    /**
     * Creamos aulas asignandole de manera comentada a que aula
     * pertenece cada una. 
     * @param listaA 
     */
    public void crear_aula(List listaA){
        listaA.add(new Aula(12));   // matematica
        listaA.add(new Aula(17));   // ingles
        listaA.add(new Aula(10));   // historia
        listaA.add(new Aula(13));   // geografia
    }
    
    /**
     * Dichas aulas tendran el mismo (id) de los profesores con su materia
     * correspondiente.
     * @param listaP 
     */
    public void crear_profesor(List listaP){
        listaP.add(new Profesor("Matematica",12,"Juan","Arce",30,'m'));
        listaP.add(new Profesor("Ingles",17,"Paola","Guzman",23,'f'));
        listaP.add(new Profesor("Historia",10,"Leandro","Pacheco",31,'m'));
        listaP.add(new Profesor("Geografia",13,"Sara","Espinoza",34,'f'));
    }
    
    public void crear_alumno(List listaAL){
        listaAL.add(new Alumno("Shiki","Tohno",14,'m'));
        listaAL.add(new Alumno("Mario","Bestino",3,'m'));
        listaAL.add(new Alumno("Pablo","Guzman",14,'m'));
        listaAL.add(new Alumno("Arturo","Pendragon",15,'m'));
        listaAL.add(new Alumno("Phill","Walker",14,'m'));
        
        listaAL.add(new Alumno("Cue","Arc",16,'f'));
        listaAL.add(new Alumno("Ciel","Phoenix",2,'f'));
        listaAL.add(new Alumno("Shiki","Ryougi",17,'f'));
        listaAL.add(new Alumno("Akiha","Tohno",14,'f'));
        listaAL.add(new Alumno("Ellie","Miller",1,'f'));
    }
    
    public void mostrar_alumnos(List listaAL){
        System.out.println("\n\t..::ALUMNOS::..");
        listaAL.forEach(a->System.out.println(a.toString()+"\n"));
    }
    
    public void mostrar_profesores(List listaP){
        System.out.println("\n\t..::PROFESORES::..");
        listaP.forEach(p->System.out.println(p.toString()+"\n"));
    }
    
    public void mostrar_aulas(List listaA){
        System.out.println("\n\t..::AULAS::..");
        listaA.forEach(a->System.out.println(a.toString()+"\n"));
    }
    
    /**
     * Lo que realiza este metodo es verificar si el alumno aprobo.
     * Dicha nota para aprobar es 7.
     * @param listaAL 
     */
    public void alumno_aprobado(List listaAL){
        /*
        He creado una funcion para que tire numeros de manera aleatoria, estos numeros seran las
        notas de calificacion de los alumnos.
        */
        int Nota[]={1,2,3,4,5,6,7,8,9,10};  // notas disponibles
        int aleatorio=(int)(Math.random()*10);  // toma numeros aleatorios del arreglo(Nota).
        int i=0;
        System.out.println("Se Aprueba con 7");
        
        for(Object a:listaAL){
            aleatorio=(int)(Math.random()*10);
            if (Nota[aleatorio]>=7){
                System.out.println("Alumno: "+((Alumno)a).getNombre()+" "+((Alumno)a).getApellido()+" Aprobo con: "+Nota[aleatorio]);
            }else{
                System.out.println("Alumno: "+((Alumno)a).getNombre()+" "+((Alumno)a).getApellido()+" Reprobo con: "+Nota[aleatorio]);
            }
        }
    }
    
    /**
     * La funcion de este metodo es seleccionar de manera aleatoria una materia,
     * si esa materia seleccionada es igual a la materia de uno de los profesores,
     * ese profesor en particular dara clases de su materia, caso contrario no.
     * AQUI DECIDI MOSTRAR LOS RESULTADOS POR CONSOLA PORQU ES MAS PRACTICA MOSTRAR TODOS
     * LOS RESULTADOS DE ESTE METODO A LA VEZ.
     * @param listaP 
     */
    public void profesor_materia(List listaP){
        String Mat[]={"Matematica","Ingles","Historia","Geografia","Lengua","Quimica","Biologia","Fisica"};
        int aleatorio=(int)(Math.random()*8);
        
        for(Object p:listaP){
            aleatorio=(int)(Math.random()*8);
            if (Mat[aleatorio].equals(((Profesor)p).getMateria())){
                System.out.println("El/La Profesor/a: "+((Profesor)p).getNombre()+" "+((Profesor)p).getApellido()+", Dara clases de su materia: ("+Mat[aleatorio]+")");
            }else{
                System.out.println("El/La Profesor/a: "+((Profesor)p).getNombre()+" "+((Profesor)p).getApellido()+", NO dara clases de la materia: ("+Mat[aleatorio]+")");
            }
        }
    }
    
    /**
     * La funcion de este metodo es la siguiente:
     * Aquellos alumnos que su edad sea menor a 4 se modificara tanto nombre, apellido y edad
     * como resultados por defecto.
     * Esto es asi porque no hay alumnos de menor edad.
     * @param listaAL 
     */
    public void alumno_default(List listaAL){
        int i=0;
        for (i=0;i<listaAL.size();i++){
            if (((Alumno)listaAL.get(i)).getEdad()<4 && ((Alumno)listaAL.get(i)).getSexo()=='m'){
                listaAL.set(i,new Alumno(((Alumno)listaAL.get(i)).getNOMBREH_DEFH(),((Alumno)listaAL.get(i)).getAPELLIDO_DEF(),((Alumno)listaAL.get(i)).getEDAD_DEF(),((Alumno)listaAL.get(i)).getSexo()));
            }
        }
        
        for (i=0;i<listaAL.size();i++){
            if (((Alumno)listaAL.get(i)).getEdad()<4 && ((Alumno)listaAL.get(i)).getSexo()=='f'){
                listaAL.set(i,new Alumno(((Alumno)listaAL.get(i)).getNOMBREM_DEFM(),((Alumno)listaAL.get(i)).getAPELLIDO_DEF(),((Alumno)listaAL.get(i)).getEDAD_DEF(),((Alumno)listaAL.get(i)).getSexo()));
            }
        }
        
    }
    
    /**
     * Lo que realiza este metodo es lo siguiente:
     * Tendremos un menu con (id) de aulas de cada materia,
     * dependiendo del aula de esa materia el profesor dara clases de su materia
     * si esta misma corresponde con el mismo (id) de aula donde se encuentra su materia.
     * @param listaP
     * @param listaA 
     */
    public void aula_profesor(List listaP,List listaA){
        int opcion;
        
        do{
            
            System.out.println("\n\t..::MENU::..");
            System.out.println("1. Aula Matematica, ID: 12");
            System.out.println("2. Aula Ingles, ID: 17");
            System.out.println("3. Aula Historia, ID: 10");
            System.out.println("4. Aula Geografia, ID: 13");
            System.out.println("5. Salir");
            System.out.print("Seleccione opcion: ");
            opcion=entrada.nextInt();
                    
            switch(opcion){
                case 1:
                    System.out.println("Ingrese ID de Aula de Matematica: ");
                    int aulaM=entrada.nextInt();
                    if (aulaM==((Aula)listaA.get(0)).getIdAula() && aulaM==((Profesor)listaP.get(0)).getIdProfAula()){
                        System.out.println("El Profesor: "+((Profesor)listaP.get(0)).getNombre()+" "+((Profesor)listaP.get(0)).getApellido()+" SI Enseña en el Aula de: "+((Profesor)listaP.get(0)).getMateria());
                    }else{
                        System.out.println("El Profesor: "+((Profesor)listaP.get(0)).getNombre()+" "+((Profesor)listaP.get(0)).getApellido()+" NO Enseña en esa Aula: "+((Profesor)listaP.get(0)).getMateria());
                    }
                    break;
                case 2:
                    System.out.println("Ingrese ID de Aula de Ingles: ");
                    int aulaI=entrada.nextInt();
                    if (aulaI==((Aula)listaA.get(1)).getIdAula() && aulaI==((Profesor)listaP.get(1)).getIdProfAula()){
                        System.out.println("La Profesora: "+((Profesor)listaP.get(1)).getNombre()+" "+((Profesor)listaP.get(1)).getApellido()+" SI Enseña en el Aula de: "+((Profesor)listaP.get(1)).getMateria());
                    }else{
                        System.out.println("La Profesora: "+((Profesor)listaP.get(1)).getNombre()+" "+((Profesor)listaP.get(1)).getApellido()+" NO Enseña en esa Aula: "+((Profesor)listaP.get(1)).getMateria());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese ID de Aula de Historia: ");
                    int aulaH=entrada.nextInt();
                    if (aulaH==((Aula)listaA.get(2)).getIdAula() && aulaH==((Profesor)listaP.get(2)).getIdProfAula()){
                        System.out.println("El Profesor: "+((Profesor)listaP.get(2)).getNombre()+" "+((Profesor)listaP.get(2)).getApellido()+" SI Enseña en el Aula de: "+((Profesor)listaP.get(2)).getMateria());
                    }else{
                        System.out.println("El Profesor: "+((Profesor)listaP.get(2)).getNombre()+" "+((Profesor)listaP.get(2)).getApellido()+" NO Enseña en esa Aula: "+((Profesor)listaP.get(2)).getMateria());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese ID de Aula de Geografia: ");
                    int aulaG=entrada.nextInt();
                    if (aulaG==((Aula)listaA.get(3)).getIdAula() && aulaG==((Profesor)listaP.get(3)).getIdProfAula()){
                        System.out.println("La Profesora: "+((Profesor)listaP.get(3)).getNombre()+" "+((Profesor)listaP.get(3)).getApellido()+" SI Enseña en el Aula de: "+((Profesor)listaP.get(3)).getMateria());
                    }else{
                        System.out.println("La Profesora: "+((Profesor)listaP.get(3)).getNombre()+" "+((Profesor)listaP.get(3)).getApellido()+" NO Enseña en esa Aula: "+((Profesor)listaP.get(3)).getMateria());
                    }
                    break;
                case 5: break;
                default: System.out.println("Error de opcion");
            }
            
        }while(opcion!=5);
    }
    
}
