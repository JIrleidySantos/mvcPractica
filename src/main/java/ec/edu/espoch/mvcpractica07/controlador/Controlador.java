/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.mvcpractica07.controlador;

import ec.edu.espoch.mvcpractica07.Vista.Vista;
import ec.edu.espoch.mvcpractica07.testerVista.TesterControlador;

/**
 *
 * @author mundo
 */
public class Controlador {
    
   private Vista vista;
   private TesterControlador testerControlador;

    public Controlador(Vista vista, TesterControlador testerControlador) {
        this.vista = vista;
        this.testerControlador = new TesterControlador();
    }
   
    public void agregarTarea(){
        try {
            String titulo = this.vista.getTxtTitulo();
            String descripcion = this.vista.getTxtDescripcion();
            boolean estado = this.vista.getEstado();
            
            if (this.vista != null) {
                S
            }
            
        } catch (Exception e) {
        }
    }
   
   
   
    
}
