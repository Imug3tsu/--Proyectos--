
package Escuela;

public class Persona {
    private static final String NOMBREH_DEFH="Jhon";
    private static final String NOMBREM_DEFM="Jane";
    private static final String APELLIDO_DEF="Doe";
    private static final int EDAD_DEF=0;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;

    public Persona() {
    }
    
    public Persona(String nombre, String apellido, int edad,char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public static String getNOMBREH_DEFH() {
        return NOMBREH_DEFH;
    }

    public static String getNOMBREM_DEFM() {
        return NOMBREM_DEFM;
    }

    public char getSexo() {
        return sexo;
    }

    public static String getAPELLIDO_DEF() {
        return APELLIDO_DEF;
    }

    public static int getEDAD_DEF() {
        return EDAD_DEF;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

    public int getEdad() {
        return edad;
    }
}
