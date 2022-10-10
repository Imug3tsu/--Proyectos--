
package Escuela;

public class Aula {
    private static final int AULA_DEF=0;
    private int idAula;

    public Aula(int idAula) {
        this.idAula = idAula;
    }

    public int getIdAula() {
        return idAula;
    }

    public static int getAULA_DEF() {
        return AULA_DEF;
    }

    @Override
    public String toString() {
        return "Aula: "+idAula;
    }
    
    
}
