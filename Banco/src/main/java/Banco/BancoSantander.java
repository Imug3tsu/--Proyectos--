
package Banco;

public class BancoSantander {
    private String nombre;
    private Cliente listaClienteBS=new Cliente();
    private double monto;

    public BancoSantander(String nombre) {
        this.nombre = nombre;
    }
    
    public BancoSantander(Cliente lista) {
        this.listaClienteBS = lista;
    }
    
    public void ingresarCliente(Cliente cliente){
        listaClienteBS=cliente;
    }
    
    public Cliente getClienteBS(){
        return listaClienteBS;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getMonto() {
        return monto;
    }
    
    public double ingresarDinero(double ingreso){
        return monto+=ingreso;
    }
    
    public double retirarDinero(double retiro){
        return monto-=retiro;
    }
    
    public double consultar_dinero(double saldo){
        return monto=saldo;
    }
    
}
