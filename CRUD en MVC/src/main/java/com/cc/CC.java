
package com.cc;

import Controlador.Ctrl;
import model.Modelo;
import model.Gatos;
import vista.Formulario;

/*
Conexion a base de datos, creacion de CRUD en MVC.
Gracias a MVC podremos realizar cambios de manera mas facil,
por ejemplo, si quitamos el boton(Buscar) y lo remplazamos por otro
no sucedera nada, el codigo seguira funcionando, pero es necesario cambiar de nombre
la variable del boton eliminado al que tenia antes, en este caso(btnBuscar).

Este CRUD se encarga de crear una persona con sus respectivos datos.
Nombre, apellido, email, edad, sexo, clave.

Podremos realizar las siguientes funciones:
Añadir Persona, Modificar Persona, Eliminar Persona, y Limpiar los casilleros.

IMPORTANTE:
Para buscar por medio de clave debemos de clikcar dos veces para que se busque el (id) correcto.
*/

public class CC {

    public static void main(String[] args) {
        
        Formulario f=new Formulario();
        Modelo m=new Modelo();
        Gatos p=new Gatos();
        Ctrl c=new Ctrl(f, m, p);
        
        f.setVisible(true);
    }
}
