
package Escuela;

public class Alumno extends Persona{
    
    public Alumno(String nombre, String apellido, int edad, char sexo) {
        super(nombre, apellido, edad, sexo);
    }

    @Override
    public String toString() {
        return "Alumno: "+Alumno.this.getNombre()+
                "\nApellido: "+Alumno.this.getApellido()+
                "\nEdad: "+Alumno.this.getEdad()+
                "\nSexo: "+Alumno.this.getSexo();
    }
}
