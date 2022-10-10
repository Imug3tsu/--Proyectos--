
package Verificacion;

public class Datos_user{
    private String usuario;
    private String contraseña;
    private String correo;
    private String nombre;
    private char sexo;
    private int edad;
    private double altura;

    public Datos_user() {
    }

    public Datos_user(String usuario, String contraseña, String correo, String nombre, char sexo, int edad, double altura) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Usuario: "+usuario+
                "\nContraseña: "+contraseña+
                "\nCorreo: "+correo+
                "\nNombre: "+nombre+
                "\nSexo: "+sexo+
                "\nEdad: "+edad+
                "\nAltura: "+altura;
    }
    
}
