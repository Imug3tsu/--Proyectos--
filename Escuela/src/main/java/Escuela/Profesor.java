
package Escuela;

public class Profesor extends Persona{
    private String materia;
    private int idProfAula;

    public Profesor(String materia, int idProfAula, String nombre, String apellido, int edad, char sexo) {
        super(nombre, apellido, edad, sexo);
        this.materia = materia;
        this.idProfAula = idProfAula;
    }

    public String getMateria() {
        return materia;
    }

    public int getIdProfAula() {
        return idProfAula;
    }

    @Override
    public String toString() {
        return "Profesor: "+Profesor.this.getNombre()+
                "\nApellido: "+Profesor.this.getApellido()+
                "\nEdad: "+Profesor.this.getEdad()+
                "\nSexo: "+Profesor.this.getSexo()+
                "\nMateria: "+Profesor.this.getMateria()+
                "\nidProfesor: "+Profesor.this.getIdProfAula();
    }
}
