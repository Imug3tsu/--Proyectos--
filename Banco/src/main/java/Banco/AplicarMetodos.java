
package Banco;

import java.util.Scanner;

public class AplicarMetodos {
    
    static BancoSantander bs=new BancoSantander("BS");
    static BancoNaciónArgentina bna=new BancoNaciónArgentina("BNA");
    static Cliente cliente=new Cliente();
    static Scanner entrada=new Scanner(System.in);
    
    /**
     * Creo los clientes, uno en cada banco.
     * @param cliente
     * @param bna
     * @param bs 
     */
    public void crear_cliente(Cliente cliente,BancoNaciónArgentina bna,BancoSantander bs){
        bna.ingresarCliente(new Cliente("Pablo","pab41",4568,"BNA"));
        bs.ingresarCliente(new Cliente("Cue","cue21",2384,"BS"));
    }
    
    /**
     * Muestro los clientes accediendo primero al banco al cual pertenece, y luego
     * muestro los datos del cliente.
     * @param cliente
     * @param bna
     * @param bs 
     */
    public void mostrar_clientes(Cliente cliente,BancoNaciónArgentina bna,BancoSantander bs){
        System.out.println("\t\n..::BANCO NACION ARGENTINA::..");
        System.out.println("");
        System.out.println("Nombre: "+bna.getClienteBNA().getNombre());
        System.out.println("Usuario: "+bna.getClienteBNA().getUsuario());
        System.out.println("Contraseña: "+bna.getClienteBNA().getContraseña());
        System.out.println("Banco: "+bna.getClienteBNA().getBanco());
        System.out.println("");
        
        System.out.println("\t\n..::BANCO SANTANDER RIO::..");
        System.out.println("");
        System.out.println("Nombre: "+bs.getClienteBS().getNombre());
        System.out.println("Usuario: "+bs.getClienteBS().getUsuario());
        System.out.println("Contraseña: "+bs.getClienteBS().getContraseña());
        System.out.println("Banco: "+bs.getClienteBS().getBanco());
        System.out.println("");
    }
    
    /**
     * Menu Principal donde este ejercicio se basara en todo.
     * He creado otros metodos con otros menus donde tambien mostrara otras opciones a seleccionar.
     * Si nosotros accedemos a la primera o segunda opcion, nos ejecutara el metodo de ese banco en particular.
     * @param cliente
     * @param bna
     * @param bs 
     */
    public void menu(Cliente cliente,BancoNaciónArgentina bna,BancoSantander bs){
        int opcion;
        do{
            System.out.println("\n\t..::MENU::..");
            System.out.println("1. Acceder a Banco Santander Rio");
            System.out.println("2. Acceder a Banco Nacion Argentina");
            System.out.println("3. Ver Clientes");
            System.out.println("4. Salir");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    BancoS(cliente, bs);
                    break;
                case 2:
                    BancoNA(cliente, bna);
                    break;
                case 3:
                    mostrar_clientes(cliente, bna, bs);
                    break;
                case 4: break;
                default: System.out.println("Error de opcion");
            }
            
        }while(opcion!=4);
        
    }
    
    /**
     * Tanto este Banco (BNA) como (BS) aplican lo mismo, por lo tanto solo explicare uno de ellos.
     * Este metodo se encargara de pedir los datos de la cuenta del cliente,
     * cada opcion que queramos realizar nos pedira verificacion de nuestra cuenta con nuestros datos de cuenta
     * en el banco correspondiente.
     * @param cliente
     * @param bna 
     */
    public void BancoNA(Cliente cliente,BancoNaciónArgentina bna){
        int opcion,pass=0;
        double monto=0,retirar=0,ingresar=0;
        String user;
        System.out.print("Ingrese nombre de usuario: ");
        entrada.nextLine();
        user=entrada.nextLine();
        System.out.print("Ingrese contraseña: ");
        pass=entrada.nextInt();
        
        if (bna.getClienteBNA().getUsuario().equals(user) && bna.getClienteBNA().getContraseña()==pass){
            do{
            System.out.println("\t\n..::MENU DE OPERACIONES::..");
            System.out.println("1. Ingresar dinero a cuenta");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Volver atras.");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese contraseña: ");
                    pass=entrada.nextInt();
                    
                    if (bna.getClienteBNA().getContraseña()==pass){
                        System.out.print("Ingrese monto a cargar en cuenta: ");
                        ingresar=entrada.nextDouble();
                        bna.ingresarDinero(ingresar);
                        monto+=ingresar;
                        System.out.println("Cargo la cuenta con exito");
                    }else{
                        System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese contraseña: ");
                    pass=entrada.nextInt();
                    
                    if (bna.getClienteBNA().getContraseña()==pass){
                        System.out.print("Ingrese monto a retirar: ");
                        retirar=entrada.nextDouble();
                        
                        if (bna.getMonto()==0){
                            System.out.println("No puede retirar dinero porque su cuenta esta vacia");
                        }
                        else if (bna.getMonto()>=retirar){
                            bna.retirarDinero(retirar);
                            monto-=retirar;
                            System.out.println("(Retiro de dinero con exito)");
                        }
                        else if (retirar>bna.getMonto()){
                            System.out.println("");
                            System.out.println("No puede retirar dinero de cuenta porque excede el mismo");
                            System.out.println("Monto actual: "+bna.consultar_dinero(monto));
                        }
                    }else{
                        System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese contraseña: ");
                    pass=entrada.nextInt();
                    
                    if (bna.getClienteBNA().getContraseña()==pass){
                        System.out.println("Monto: "+bna.consultar_dinero(monto));
                    }else{
                        System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
                    }
                    break;
                case 4: break;
                default: System.out.println("Error de opcion");
            }
            
        }while(opcion!=4);
            
        }else{
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
        
    }
    
    public void BancoS(Cliente cliente,BancoSantander bs){
        int opcion,pass;
        double monto=0,retirar=0,ingresar=0;
        String user;
        
        System.out.print("Ingrese nombre de usuario: ");
        entrada.nextLine();
        user=entrada.nextLine();
        System.out.print("Ingrese contraseña: ");
        pass=entrada.nextInt();
        if (bs.getClienteBS().getUsuario().equals(user) && bs.getClienteBS().getContraseña()==pass){
            do{
            System.out.println("\t\n..::MENU DE OPERACIONES::..");
            System.out.println("1. Ingresar dinero a cuenta");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Volver atras.");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese contraseña: ");
                    pass=entrada.nextInt();
                    
                    if (bs.getClienteBS().getUsuario().equals(user) && bs.getClienteBS().getContraseña()==pass){
                        System.out.print("Ingrese monto a cargar en cuenta: ");
                        ingresar=entrada.nextDouble();
                        bs.ingresarDinero(ingresar);
                        monto+=ingresar;
                        System.out.println("Cargo la cuenta con exito");
                    }else{
                        System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese contraseña: ");
                    pass=entrada.nextInt();
                    
                    if (bs.getClienteBS().getUsuario().equals(user) && bs.getClienteBS().getContraseña()==pass){
                        System.out.print("Ingrese monto a retirar: ");
                        retirar=entrada.nextDouble();
                        
                        if (bs.getMonto()==0){
                            System.out.println("No puede retirar dinero porque su cuenta esta vacia");
                        }
                        else if (bs.getMonto()>=retirar){
                            bs.retirarDinero(retirar);
                            monto-=retirar;
                            System.out.println("(Retiro de dinero con exito)");
                        }
                        else if (retirar>bs.getMonto()){
                            System.out.println("");
                            System.out.println("No puede retirar dinero de cuenta porque excede el mismo");
                            System.out.println("Monto actual: ("+bs.consultar_dinero(monto)+")");
                        }
                    }else{
                        System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese contraseña: ");
                    pass=entrada.nextInt();
                    
                    if (bs.getClienteBS().getUsuario().equals(user) && bs.getClienteBS().getContraseña()==pass){
                        System.out.println("Saldo: "+bs.consultar_dinero(monto));
                    }else{
                        System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
                    }
                    break;
                case 4: break;
                default: System.out.println("Error de opcion");
            }
            
        }while(opcion!=4);
            
        }else{
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
        
    }
    
}
