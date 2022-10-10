
package Banco;

public class BancoNaciónArgentina {
    private String nombre;
    private Cliente listaClienteBNA=new Cliente();
    private double monto;

    public BancoNaciónArgentina(String nombre) {
        this.nombre = nombre;
    }
    
    public BancoNaciónArgentina(Cliente lista) {
        this.listaClienteBNA = lista;
    }
    
    public void ingresarCliente(Cliente cliente){
        listaClienteBNA=cliente;
    }
    
    public Cliente getClienteBNA(){
        return listaClienteBNA;
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
    
    public double consultar_dinero(double saldo){
        return monto=saldo;
    }
    
    public double retirarDinero(double retiro){
        return monto-=retiro;
    }
    
}
