
package Persona1;

public class Animal {
    private String tipo;
    private String color;
    private int años;
    
    public Animal(String tipo, String color, int años) {
        this.tipo = tipo;
        this.color = color;
        this.años = años;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getAños() {
        return años;
    }
    
}
