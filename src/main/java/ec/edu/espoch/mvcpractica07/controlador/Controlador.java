/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.mvcpractica07.controlador;

import ec.edu.espoch.mvcpractica07.Vista.Vista;
import ec.edu.espoch.mvcpractica07.modelo.Tarea;
import ec.edu.espoch.mvcpractica07.testerVista.TesterControlador;

/**
 *
 * @author mundo
 */
public class Controlador {
    
   private Vista vista;
   private TesterControlador gestorTareas;
   //cuando hagas conexion quita el commentario de la linea 17 cuando hagas coneccion con el modelo
   //private GestorTareas modelo;

    public Controlador(Vista vista, TesterControlador testerControlador) {
        this.vista = vista;
        this.gestorTareas=new TesterControlador();
    }
   
    public void agregarTarea(){
        try {
            if (this.vista != null) {    
            Tarea objTarea = new Tarea();
            objTarea.setTitulo(this.vista.getTxtTitulo());
            objTarea.setDescripcion(this.vista.getTxtDescripcion());
            objTarea.setEstado(this.vista.getEstado());
            gestorTareas.prueba(objTarea);
            }else{
                vista.error("Completa los datos!");
            }
            
        } catch (Exception e) {
            vista.error("Consulta al ing Pedro ;)");
        }
    }
    
}
