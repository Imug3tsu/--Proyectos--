
package Verificacion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AplicarMetodos {
    static Usuario user=new Usuario();
    static Datos_user du=new Datos_user();
    static Scanner entrada=new Scanner(System.in);
    
    /**
     * Crearemos el usuario por comando con Scanner, es por eso que no
     * esta como parametro del metodo.
     * Ademas he realizado una regla de instrucciones para que el correo escrito sea aceptado,
     * mediante expresiones regulares.
     */
    public void crear_usuario(/*parametro*/){
        System.out.println("\n\t..::CREAR USUARIO::..");
        System.out.println("");
        System.out.println("Ingrese correo siguiendo el orden:"+
                "\nletra minuscula, (1 o 2) letras mayusculas, letra minuscula, 1 simbolo, 2 numeros, @, y completar como correo normal ");
        entrada.nextLine();
        String correo=entrada.nextLine();
        Pattern pat=Pattern.compile("^[a-z]+([A-Z]{1,2})([a-z]+)(.{1})([0-9]{2})(@{1})([a-z]+)(.{1})([a-z]+)$");
        Matcher mat=pat.matcher(correo);
            System.out.println("");
        if (mat.matches()){
            System.out.println("(Correo correcto)");
            System.out.println("");
            System.out.print("Ingrese usuario: ");
            String usuario=entrada.nextLine();
            System.out.print("Ingrese contraseña: ");
            String contraseña=entrada.nextLine();
            user=new Usuario(correo, usuario, contraseña);
            System.out.println("(Usuario creado)");
        }else{
            System.out.println("(Correo incorrecto)");
        }
    }
    
    /**
     * Este metodo se encarga de crear los datos personales del usuario, sexo, edad, etc.
     * Pero para crear los datos de usuario nos pedira verificacion del mismo,
     * tanto en usuario como contraseña.
     */
    public void crear_datos_usuario(){
        System.out.print("Ingrese usuario para confirmar: ");
        entrada.nextLine();
        String User=entrada.nextLine();
        System.out.print("Ingrese contraseña para confirmar: ");
        String pass=entrada.nextLine();
        
        if (user.getUsuario().equals(User) && user.getContraseña().equals(pass)){
            System.out.print("Ingrese nombre: ");
            String nombre=entrada.nextLine();
            System.out.print("Ingrese sexo: ");
            char sexo=entrada.next().charAt(0);
            System.out.print("Ingrese edad: ");
            int edad=entrada.nextInt();
            System.out.print("Ingrese altura: ");
            double altura=entrada.nextDouble();
            
            du=new Datos_user(user.getUsuario(),user.getContraseña(),user.getCorreo(), nombre, sexo, edad, altura);
            System.out.println("(Datos creados con excito)");
        }else{
            System.out.println("(Error, los datos son incorrectos)");
        }
    }
    
    /**
     * Muestra los datos del usuario.
     */
    public void mostrar_datos(){
        System.out.println("\n\t..::DATOS USUARIO::..");
        System.out.println(du.toString());
    }
    
    /**
     * Este metodo es el eje principal de todo, tiene opciones para todo el ejercicio.
     * Si nosotros seleccionamos una opcion nos mostrara el metodo de la opcion seleccionada. 
     */
    public void menu(){
        int opcion;
        do{
            System.out.println("\n\t..::MENU::..");
            System.out.println("1. Crear Nuevo usuario");
            System.out.println("2. Crear datos de Usuario");
            System.out.println("3. Ver datos de usuario");
            System.out.println("4. Salir");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    crear_usuario();
                    break;
                case 2:
                    if (user.getUsuario()==null){
                        System.out.println("Se debe crear un usuario para establecer sus datos");
                    }else{
                        crear_datos_usuario();
                    }
                    break;
                case 3:
                    if (du.getNombre()==null){
                        System.out.println("No se han creado datos del Usuario");
                    }else{
                        mostrar_datos();
                    }
                    break;
                case 4: break;
                default: System.out.println("Error de opcion");
            }
            
        }while(opcion!=4);
        
    }
    
}
