
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Modelo;
import model.Gatos;
import vista.Formulario;

public class Ctrl implements ActionListener{
    
    private Formulario vista;
    private Modelo model;
    private Gatos p;

    public Ctrl(Formulario vista, Modelo model, Gatos p) {
        this.vista = vista;
        this.model = model;
        this.p = p;
        this.vista.btnAñadir.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
    }
    
    public void Iniciar(){
        vista.setTitle("Gatos");
        vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==vista.btnAñadir){
            p.setNombre(vista.txtNombre.getText());
            p.setColor(vista.txtColor.getText());
            p.setAños(Integer.parseInt(vista.txtAños.getText()));
            p.setSexo(vista.cbxSexo.getSelectedItem().toString());
            p.setClave(Integer.parseInt(vista.txtClave.getText()));
            if (model.Añadir(p)){
                JOptionPane.showMessageDialog(null,"Gato añadido");
                limpiar_cajas();
            }else{
                JOptionPane.showMessageDialog(null,"Error al añadir Gato");
            }
        }
       
        if (e.getSource()==vista.btnModificar){
            p.setNombre(vista.txtNombre.getText());
            p.setColor(vista.txtColor.getText());
            p.setAños(Integer.parseInt(vista.txtAños.getText()));
            p.setSexo(vista.cbxSexo.getSelectedItem().toString());
            p.setClave(Integer.parseInt(vista.txtClave.getText()));
            p.setId(vista.txtId.getText());
            if (model.Modifficar(p)){
                JOptionPane.showMessageDialog(null,"Gato modificado");
                limpiar_cajas();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar Gato");
            }
        }
        
        if (e.getSource()==vista.btnEliminar){
            p.setId(vista.txtId.getText());
            if (model.Eliminar(p)){
                JOptionPane.showMessageDialog(null,"Gato eliminado");
                limpiar_cajas();
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar Gato");
            }
        }
        
        if (e.getSource()==vista.btnBuscar){
            p.setClave(Integer.parseInt(vista.txtClave.getText()));
            
            vista.txtNombre.setText(p.getNombre());
            vista.txtColor.setText(p.getColor());
            vista.txtAños.setText(String.valueOf(p.getAños()));
            vista.cbxSexo.setSelectedItem(p.getSexo());
            vista.txtClave.setText(String.valueOf(p.getClave()));
            vista.txtId.setText(p.getId());
            if (model.Buscar(p)){
                //JOptionPane.showMessageDialog(null,"Gatos añadida");
            }else{
                JOptionPane.showMessageDialog(null,"Error al buscar Gato");
            }
        }
        
        if (e.getSource()==vista.btnLimpiar){
            limpiar_cajas();
        }
        
    }
    
    public void limpiar_cajas(){
        vista.txtNombre.setText(null);
        vista.txtColor.setText(null);
        vista.txtClave.setText(null);
        vista.txtAños.setText(null);
        vista.cbxSexo.setSelectedIndex(0);
        vista.txtId.setText(null);
    }
    
}
