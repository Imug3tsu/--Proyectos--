
package Serializacion;

public class Hombre {
    private static final long SERIALUID=1L;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;

    public Hombre() {
    }
    
    public Hombre(String nombre, String apellido, int edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }
    
}
