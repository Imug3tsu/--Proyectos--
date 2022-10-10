
package Serializacion;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AplicarMetodos {
    static Hombre h=new Hombre();
    static Mujer m=new Mujer();
    static Scanner entrada=new Scanner(System.in);
    
    /**
     * Creo archivos (Hombre, Mujer) de texto con (BufferedWriter).
     * @param bfH
     * @param bfM
     * @throws IOException 
     */
    public void crear_personas(BufferedWriter bfH,BufferedWriter bfM) throws IOException{
        System.out.println("\n\t..::CREAR HOMBRE::..");
        System.out.print("Ingrese nombre: ");
        String nombre=entrada.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido=entrada.nextLine();
        System.out.print("Ingrese edad: ");
        int edad=entrada.nextInt();
        System.out.print("Ingrese sexo: ");
        char sexo=entrada.next().charAt(0);
        h=new Hombre(nombre, apellido, edad, sexo);
        bfH.write("\t\n..::HOMBRE::..");
        bfH.newLine();
        bfH.write("Nombre: "+nombre);
        bfH.newLine();
        bfH.write("Apellido: "+apellido);
        bfH.newLine();
        bfH.write("Edad: "+edad);
        bfH.newLine();
        bfH.write("Sexo: "+sexo);
        bfH.newLine();
        System.out.println("(Hombre creado)");
        System.out.println("");
        
        System.out.println("\n\t..::CREAR MUJER::..");
        System.out.print("Ingrese nombre: ");
        entrada.nextLine();
        nombre=entrada.nextLine();
        System.out.print("Ingrese apellido: ");
        apellido=entrada.nextLine();
        System.out.print("Ingrese edad: ");
        edad=entrada.nextInt();
        System.out.print("Ingrese sexo: ");
        sexo=entrada.next().charAt(0);
        m=new Mujer(nombre, apellido, edad, sexo);
        
        bfM.write("\t\n..::MUJER::..");
        bfM.newLine();
        bfM.write("Nombre: "+nombre);
        bfM.newLine();
        bfM.write("Apellido: "+apellido);
        bfM.newLine();
        bfM.write("Edad: "+edad);
        bfM.newLine();
        bfM.write("Sexo: "+sexo);
        bfM.newLine();
        System.out.println("(Mujer creada)");
        System.out.println("");
    }
    
    /**
     * Leo los archivos anteriores con (BufferedReader).
     * @param brH
     * @param brM
     * @throws IOException 
     */
    public void leer(BufferedReader brH,BufferedReader brM) throws IOException{
        String mostrar=brH.readLine();
        while(mostrar!=null){
            System.out.println(mostrar);
            mostrar=brH.readLine();
        }
        mostrar=brM.readLine();
        while(mostrar!=null){
            System.out.println(mostrar);
            mostrar=brM.readLine();
        }
    }
    
    /**
     * Este metodo se encarga de leer y copiar el contiendo de los archivos(Hombre, Mujer),
     * para pegar el contenido en el archivo (destino).
     * @param biH
     * @param biM
     * @param biD
     * @throws IOException 
     */
    public void destino(BufferedInputStream biH,BufferedInputStream biM,BufferedOutputStream biD) throws IOException{
        byte leer1[]=new byte[biH.available()];
        byte leer2[]=new byte[biM.available()];
        biH.read(leer1);
        biM.read(leer2);
        biD.write(leer1);
        biD.write(leer2);
    }
    
    /**
     * Este metodo se encarga de realizar la serializacion del archivo (destino).
     * @param ois 
     */
    public void serializacion(ObjectInputStream ois){
        try {
            Hombre mostrar=(Hombre)ois.readObject();
            System.out.println("Nombre: "+mostrar.getNombre());
            System.out.println("Apellido: "+mostrar.getApellido());
            System.out.println("Edad: "+mostrar.getEdad());
            System.out.println("Sexo: "+mostrar.getSexo());
            System.out.println("");
        } catch (ClassNotFoundException|IOException ex) {
            Logger.getLogger(AplicarMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
