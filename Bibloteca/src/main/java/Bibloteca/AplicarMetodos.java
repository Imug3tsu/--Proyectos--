
package Bibloteca;

import java.util.Scanner;

/**
 * Creo dos Objeto clase Arreglo que contiene 2 Biblotecas y 4 libros en cada bibloteca.
 * @author Pablo Guzmán
 */
public class AplicarMetodos {
    static Bibloteca bib[]=new Bibloteca[2];
    static Libros libro[]=new Libros[4];
    static Scanner entrada=new Scanner(System.in);
    
    /**
     * Creamos los libros accediendo primero por el arreglo bibloteca.
     * los libros tendran numero de prestamo disponible y cantidad del mismo libro que se a pedido prestado.
     * @param bib
     * @param libro 
     */
    public void crear_libro(Bibloteca bib[],Libros libro[]){
        bib[0]=new Bibloteca("Cuspide");
        bib[0].ingresarLibro(new Libros("H.P. Lovecraft","Necronomicon",250,528,100.99,2,0)); // los dos ultimos representan Prestamo | Prestado.
        bib[0].ingresarLibro(new Libros("Stephen King","It",350,621,143.99,1,3));
        bib[0].ingresarLibro(new Libros("Frank Herbert","Dune",400,385,240.99,0,1)); // aqui pidieron un prestamo de la ultima unidad que le quedaba a la bibloteca.
        bib[0].ingresarLibro(new Libros("Brandon Sanderson","El camino de los reyes",150,642,112.99,3,2));
        
        bib[1]=new Bibloteca("Norma");
        bib[1].ingresarLibro(new Libros("Friedrich Nietzsche","Mas alla del bien y el mal",150,213,111.99,0,3)); // lo mismo que el libro (Dune).
        bib[1].ingresarLibro(new Libros("Stephen Hawking","El Gran Diseño",123,547,105.99,3,0));
        bib[1].ingresarLibro(new Libros("H.P. Lovecraft","The call of the Cthulhu",100,478,80.99,2,1));
        bib[1].ingresarLibro(new Libros("Stephen King","El Resplandor",300,598,213.99,4,5));
    }
    
    /**
     * Mostramos los libros de la bibloteca (Cuspide), pero primero accedemos a la bibloteca correspondiente y luego a los libros.
     * @param bib
     * @param libro 
     */
    public void mostrar_libros_Cuspide(Bibloteca bib[],Libros libro[]){
        int j=0;
        System.out.println("\n\t.:BIBLOTECA:. "+bib[0].getNombre());
        System.out.println("");
        for (j=0;j<libro.length;j++){
            System.out.println(bib[0].getLibro(j).toString());
            System.out.println("");
        }
    }
    
    /**
     * Lo mismo que el metodo anterior, pero este con la Bibloteca (Norma).
     * @param bib
     * @param libro 
     */
    public void mostrar_libros_Norma(Bibloteca bib[],Libros libro[]){
        int j=0;
        System.out.println("\n\t.:BIBLOTECA:. "+bib[1].getNombre());
        System.out.println("");
        for (j=0;j<libro.length;j++){
            System.out.println(bib[1].getLibro(j).toString());
            System.out.println("");
        }
    }
    
    /**
     * Este metodo se encarga de mostrar el libro con mayor precio,
     * entre todos los libros de ambas biblotecas.
     * @param bib
     * @param libro 
     */
    public void libro_mayor_precio(Bibloteca bib[],Libros libro[]){
        int count=0,count2=0;
        int i=0,j=0;
        int auxiliar=(int) bib[i].getLibro(j).getPrecio();
        
        for (i=0;i<bib.length;i++){
            for (j=0;j<libro.length;j++){
                if (auxiliar<bib[i].getLibro(j).getPrecio()){
                    auxiliar=(int) bib[i].getLibro(j).getPrecio();
                    count=auxiliar;
                    count=i;
                    count2=j;
                }
            }
        }
        System.out.println("Libro con mayor precio: ("+bib[count].getLibro(count2).getTitulo()+"), de la Bibloteca: ("+bib[count].getNombre()+
                ")\nCon un precio de: "+bib[count].getLibro(count2).getPrecio()+" USD");
    }
    
    /**
     * Lo mismo que el anterior metodo, pero este mostrara el libro con menor precio.
     * @param bib
     * @param libro 
     */
    public void libro_menor_precio(Bibloteca bib[],Libros libro[]){
        int count=0,count2=0;
        int i=0,j=0;
        int auxiliar=(int) bib[i].getLibro(j).getPrecio();
        
        for (i=0;i<bib.length;i++){
            for (j=0;j<libro.length;j++){
                if (auxiliar>bib[i].getLibro(j).getPrecio()){
                    auxiliar=(int) bib[i].getLibro(j).getPrecio();
                    count=auxiliar;
                    count=i;
                    count2=j;
                }
            }
        }
        System.out.println("");
        System.out.println("Libro con menor precio: ("+bib[count].getLibro(count2).getTitulo()+"), de la Bibloteca: ("+bib[count].getNombre()+
                ")\nCon un precio de: "+bib[count].getLibro(count2).getPrecio()+" USD");
    }
    
    /**
     * Este es el menu principal, mostrara esas 4 opciones,
     * si tu seleccionas la opcion 1 o 2, ejecutara el metodo correspondiente antes creado, ejemplo(mostrar_libros_Cuspide),etc.
     * Si seleccionas la opcion 3 ejecutara el metodo (pedir_libro) y si seleccionas la opcion "volver atras",
     * volveras al al primer menu mostrado(menu_inicio).
     * @param bib
     * @param libro 
     */
    public void menu_inicio(Bibloteca bib[],Libros libro[]){
        int opcion;
        
        do{
            System.out.println("\n\t..::MENU::..");
            System.out.println("1. Ver libros de Bibloteca (Cuspide)");
            System.out.println("2. Ver libros de Bibloteca (Norma)");
            System.out.println("3. Pedir un prestamo");
            System.out.println("4. Salir");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    mostrar_libros_Cuspide(bib, libro);
                    break;
                case 2:
                    mostrar_libros_Norma(bib, libro);
                    break;
                case 3:
                    pedir_libro(bib, libro);
                    break;
                case 4: break;
                default: System.out.println("Error de opcion");
            }
        }while(opcion!=4);
    }
    
    /**
     * En este metodo he creado un menu de libros, una vez seleccionado uno de ellos
     * mostrara su cantidad de prestamo disponible, y pedira ingresar la cantidad de prestamos que quieres realizar del mismo.
     * Si tu numero ingresado excede el numero de prestamo disponible del libro, no podras realizar el prestamo porque
     * es un numero mayor al prestamo disponible del libro seleccionado.
     * @param bib
     * @param libro 
     */
    public void pedir_libro(Bibloteca bib[],Libros libro[]){
        int i=0,j=0;
        int count=0,count2=0;
        int auxiliar=bib[i].getLibro(j).getCantPrestamo();
        int opcion;
        do{
            System.out.println("\n\t..::MENU DE LIBROS::..");
            System.out.println("1. Necronomicon, por (H.P. Lovecraft)");
            System.out.println("2. It, por (Stephen King)");
            System.out.println("3. Dune, por (Frank Herbert)");
            System.out.println("4. El camino de los reyes, por (Brandon Sanderson)");
            System.out.println("5. Mas alla del bien y el mal, por (Friedrich Nietzsche)");
            System.out.println("6. El Gran Diseño, por (Stephen Hawking)");
            System.out.println("7. The call of the Cthulhu, por (H.P. Lovecraft)");
            System.out.println("8. El Resplandor, por (Stephen King)");
            System.out.println("9. Volver atras");
            System.out.print("Ingrese opcion: ");
            System.out.println("");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    if (bib[0].getLibro(0).getCantPrestamo()<0){
                        System.out.println("No puede pedir prestamo de libro: "+bib[0].getLibro(0).getTitulo()+", por que este libro no tiene prestamo disponible");
                    }else{
                        System.out.println("Hay prestamo disponible para el libro: "+bib[0].getLibro(0).getTitulo()+
                                "\nPrestamos disponibles: "+bib[0].getLibro(0).getCantPrestamo());
                        System.out.println("");
                        System.out.print("Ingrese cuantos prestamos necesita: ");
                        int p1=entrada.nextInt();
                        if (p1>bib[0].getLibro(0).getCantPrestamo()){
                            System.out.println("No puede pedir prestamo mayor del mostrado en el libro");
                        }
                        if (p1<=bib[0].getLibro(0).getCantPrestamo()){
                            System.out.println("Felicidades, prestamo exitoso del libro: "+bib[0].getLibro(0).getTitulo());
                        }
                    }
                    break;
                case 2:
                    if (bib[0].getLibro(1).getCantPrestamo()==0){
                        System.out.println("No puede pedir prestamo de libro: "+bib[0].getLibro(1).getTitulo()+", por que este libro no tiene prestamo disponible");
                    }else{
                        System.out.println("Hay prestamo disponible para el libro: "+bib[0].getLibro(1).getTitulo()+
                                "\nPrestamos disponibles: "+bib[0].getLibro(1).getCantPrestamo());
                        System.out.println("");
                        System.out.print("Ingrese cuantos prestamos necesita: ");
                        int p1=entrada.nextInt();
                        if (p1>bib[0].getLibro(1).getCantPrestamo()){
                            System.out.println("No puede pedir prestamo mayor del mostrado en el libro");
                        }
                        if (p1<=bib[0].getLibro(1).getCantPrestamo()){
                            System.out.println("Felicidades, prestamo exitoso del libro: "+bib[0].getLibro(1).getTitulo());
                        }
                    }
                    break;
                case 3:
                    if (bib[0].getLibro(2).getCantPrestamo()==0){
                        System.out.println("No puede pedir prestamo de libro: "+bib[0].getLibro(2).getTitulo()+", por que este libro no tiene prestamo disponible");
                    }else{
                        System.out.println("Hay prestamo disponible para el libro: "+bib[0].getLibro(2).getTitulo()+
                                "\nPrestamos disponibles: "+bib[0].getLibro(2).getCantPrestamo());
                        System.out.println("");
                        System.out.print("Ingrese cuantos prestamos necesita: ");
                        int p1=entrada.nextInt();
                        if (p1>bib[0].getLibro(2).getCantPrestamo()){
                            System.out.println("No puede pedir prestamo mayor del mostrado en el libro");
                        }
                        if (p1<=bib[0].getLibro(2).getCantPrestamo()){
                            System.out.println("Felicidades, prestamo exitoso del libro: "+bib[0].getLibro(2).getTitulo());
                        }
                    }
                    break;
                case 4:
                    if (bib[0].getLibro(3).getCantPrestamo()==0){
                        System.out.println("No puede pedir prestamo de libro: "+bib[0].getLibro(3).getTitulo()+", por que este libro no tiene prestamo disponible");
                    }else{
                        System.out.println("Hay prestamo disponible para el libro: "+bib[0].getLibro(3).getTitulo()+
                                "\nPrestamos disponibles: "+bib[0].getLibro(3).getCantPrestamo());
                        System.out.println("");
                        System.out.print("Ingrese cuantos prestamos necesita: ");
                        int p1=entrada.nextInt();
                        if (p1>bib[0].getLibro(3).getCantPrestamo()){
                            System.out.println("No puede pedir prestamo mayor del mostrado en el libro");
                        }
                        if (p1<=bib[0].getLibro(3).getCantPrestamo()){
                            System.out.println("Felicidades, prestamo exitoso del libro: "+bib[0].getLibro(3).getTitulo());
                        }
                    }
                    break;
                case 5:
                    if (bib[1].getLibro(0).getCantPrestamo()==0){
                        System.out.println("No puede pedir prestamo de libro: "+bib[1].getLibro(0).getTitulo()+", por que este libro no tiene prestamo disponible");
                    }else{
                        System.out.println("Hay prestamo disponible para el libro: "+bib[1].getLibro(0).getTitulo()+
                                "\nPrestamos disponibles: "+bib[1].getLibro(0).getCantPrestamo());
                        System.out.println("");
                        System.out.print("Ingrese cuantos prestamos necesita: ");
                        int p1=entrada.nextInt();
                        if (p1>bib[1].getLibro(0).getCantPrestamo()){
                            System.out.println("No puede pedir prestamo mayor del mostrado en el libro");
                        }
                        if (p1<=bib[1].getLibro(0).getCantPrestamo()){
                            System.out.println("Felicidades, prestamo exitoso del libro: "+bib[1].getLibro(0).getTitulo());
                        }
                    }
                    break;
                case 6:
                    if (bib[1].getLibro(1).getCantPrestamo()==0){
                        System.out.println("No puede pedir prestamo de libro: "+bib[1].getLibro(1).getTitulo()+", por que este libro no tiene prestamo disponible");
                    }else{
                        System.out.println("Hay prestamo disponible para el libro: "+bib[1].getLibro(1).getTitulo()+
                                "\nPrestamos disponibles: "+bib[1].getLibro(1).getCantPrestamo());
                        System.out.println("");
                        System.out.print("Ingrese cuantos prestamos necesita: ");
                        int p1=entrada.nextInt();
                        if (p1>bib[1].getLibro(1).getCantPrestamo()){
                            System.out.println("No puede pedir prestamo mayor del mostrado en el libro");
                        }
                        if (p1<=bib[1].getLibro(1).getCantPrestamo()){
                            System.out.println("Felicidades, prestamo exitoso del libro: "+bib[1].getLibro(1).getTitulo());
                        }
                    }
                    break;
                case 7:
                    if (bib[1].getLibro(2).getCantPrestamo()==0){
                        System.out.println("No puede pedir prestamo de libro: "+bib[1].getLibro(2).getTitulo()+", por que este libro no tiene prestamo disponible");
                    }else{
                        System.out.println("Hay prestamo disponible para el libro: "+bib[1].getLibro(2).getTitulo()+
                                "\nPrestamos disponibles: "+bib[1].getLibro(2).getCantPrestamo());
                        System.out.println("");
                        System.out.print("Ingrese cuantos prestamos necesita: ");
                        int p1=entrada.nextInt();
                        if (p1>bib[1].getLibro(2).getCantPrestamo()){
                            System.out.println("No puede pedir prestamo mayor del mostrado en el libro");
                        }
                        if (p1<=bib[1].getLibro(2).getCantPrestamo()){
                            System.out.println("Felicidades, prestamo exitoso del libro: "+bib[1].getLibro(2).getTitulo());
                        }
                    }
                    break;
                case 8:
                    if (bib[1].getLibro(3).getCantPrestamo()==0){
                        System.out.println("No puede pedir prestamo de libro: "+bib[1].getLibro(3).getTitulo()+", por que este libro no tiene prestamo disponible");
                    }else{
                        System.out.println("Hay prestamo disponible para el libro: "+bib[1].getLibro(3).getTitulo()+
                                "\nPrestamos disponibles: "+bib[1].getLibro(3).getCantPrestamo());
                        System.out.println("");
                        System.out.print("Ingrese cuantos prestamos necesita: ");
                        int p1=entrada.nextInt();
                        if (p1>bib[1].getLibro(3).getCantPrestamo()){
                            System.out.println("No puede pedir prestamo mayor del mostrado en el libro");
                        }
                        if (p1<=bib[1].getLibro(3).getCantPrestamo()){
                            System.out.println("Felicidades, prestamo exitoso del libro: "+bib[1].getLibro(3).getTitulo());
                        }
                    }
                    break;
                case 9: break;
                default: System.out.println("Error de opcion");
            }
            
        }while(opcion!=9);
        
    }
    
}






















