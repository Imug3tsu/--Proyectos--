
package Banco;

/*
Ejercicio de simulador de banco, ingresaremos dinero a la cuenta, retiraremos dinero
de la cuenta, y consultaremos dinero de la misma.
*/


public class Main {
    static AplicarMetodos metodo=new AplicarMetodos();
    static BancoSantander bs=new BancoSantander("BS");
    static BancoNaciónArgentina bna=new BancoNaciónArgentina("BNA");
    static Cliente cliente=new Cliente();
    
    
    /**
     * Ejecutar los metodos ya declarados.
     * @param args 
     */
    public static void main(String[] args) {
        
        metodo.crear_cliente(cliente, bna, bs);
        metodo.menu(cliente, bna, bs);
        
        
    }
}

