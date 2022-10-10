
package Serializacion;

import java.io.*;
import java.util.Scanner;

/*
Ejercicio de creacion de archivos de texto(Hombre, Mujer), y copiar el contenido
de ambos archivos para pegarlo en un nuevo archivo destino.
Nosotros escribiremos su ruta.

C:\Users\imug3\Desktop\Hombre.txt(Archivo Hombre).   Ejemplo de ruta escritorio, lo unico a cambiar es
C:\Users\imug3\Desktop\Mujer.txt(Archivo Mujer).    el nombre de usuario(imug3) por su nombre de usuario.
C:\Users\imug3\Desktop\Destino.txt(Archivo Destino).
*/

public class Main {
    static AplicarMetodos metodo=new AplicarMetodos();
    static Scanner entrada=new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Creacion de Archivos de texto(.txt)");
        System.out.print("Ingrese direccion de archivo 1: ");
        String ruta1=entrada.nextLine();
        System.out.print("Ingrese direccion de archivo 2: ");
        String ruta2=entrada.nextLine();
        
        /**
         * Creamos los ficheros (Hombre, Mujer) con contenido.
         */
        try(BufferedWriter bfH=new BufferedWriter(new FileWriter(ruta1));
            BufferedWriter bfM=new BufferedWriter(new FileWriter(ruta2))){
            metodo.crear_personas(bfH, bfM);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Mostrar contenido de ambos archivos(Hombre,Mujer)");
        System.out.println("1. Mostrar");
        System.out.println("2. No Mostrar");
        System.out.print("Ingrese opcion: ");
        int opcion=entrada.nextInt();
        
        if (opcion==1){
            /**
            * Leemos los archivos creados.
            */
            try(BufferedReader brH=new BufferedReader(new FileReader(ruta1));
                BufferedReader brM=new BufferedReader(new FileReader(ruta2))){
                metodo.leer(brH, brM);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("");
        System.out.println("Copiar contenido de ambos archivos y pegarlo en el archivo (destino)");
        System.out.print("Ingrese direccion de archivo 1: ");
        entrada.nextLine();
        ruta1=entrada.nextLine();
        System.out.print("Ingrese direccion de archivo 2: ");
        ruta2=entrada.nextLine();
        System.out.print("Ingrese direccion de archivo (destino): ");
        String ruta3=entrada.nextLine();
        
        /**
         * Aqui copiamos el contenido de los archivos (Hombre,Mujer)
         * y los transcribimos en el archivo destino.
         */
        try(BufferedInputStream biH=new BufferedInputStream(new FileInputStream(ruta1));
            BufferedInputStream biM=new BufferedInputStream(new FileInputStream(ruta2));
            BufferedOutputStream biD=new BufferedOutputStream(new FileOutputStream(ruta3))){
            metodo.destino(biH, biM, biD);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        String texto;
        
        System.out.println("SERIALIZACION");
        System.out.println("Realizar serializacion?");
        System.out.println("yes | no: ");
        texto=entrada.nextLine();
        if (texto.equals("yes")){
            /**
            * Creamos una Variable (File) para trabajar de manera mas eficiente con la
            * direccion del archivo(destino).
            * Si el archivo ya existe utilizaremos la clase (MiObjectOutputStream)
            * para no crear otra cabecera, si el archivo no existe crearemos una con (ObjectOutputStream),
            * tambien para no crear otra cabecera.
            */
            File destino=new File(ruta3);
            
            try{
                if(destino.exists()){
                MiObjectOutputStream moos=new MiObjectOutputStream(new FileOutputStream(destino,true));
                moos.writeObject(destino);
                moos.close();
            }else{
                ObjectOutputStream bos=new ObjectOutputStream(new FileOutputStream(destino));
                bos.writeObject(destino);
                bos.close();
            }
                System.out.println("(Serializacion exitosa)");
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        
    }
}
