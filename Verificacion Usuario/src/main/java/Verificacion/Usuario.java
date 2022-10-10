
package Verificacion;

public class Usuario {
    private String correo;
    private String usuario;
    private String contraseña;
    

    public Usuario() {
    }

    public Usuario(String correo, String usuario, String contraseña) {
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Correo: "+correo+
                "\nUsuario: "+usuario+
                "\nContraseña: "+contraseña;
    }
    
}
