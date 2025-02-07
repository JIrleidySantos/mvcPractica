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
   //private TesterControlador testerControlador;
   

    public Controlador(Vista vista, TesterControlador testerControlador) {
        this.vista = vista;
        
    }
   
    public void agregarTarea(){
        try {
            TesterControlador testerControlador = new TesterControlador();
            Tarea objTarea = new Tarea();
            objTarea.setTitulo(this.vista.getTxtTitulo());
            objTarea.setDescripcion(this.vista.getTxtDescripcion());
            objTarea.setEstado(this.vista.getEstado());
            
            if (this.vista != null) {
                testerControlador.prueba(objTarea);
            }
            
        } catch (Exception e) {
            
        }
    }
    
}
