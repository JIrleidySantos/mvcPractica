/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.mvcpractica07.testerVista;

import ec.edu.espoch.mvcpractica07.controlador.Controlador;

/**
 *
 * @author mundo
 */
public class TesterControlador {
    
    
    public void prueba(Tarea objTarea){
        System.out.println("Titulo: "+ objTarea.getTitulo());
        System.out.println("Descripcion: "+objTarea.getDescripcion());
        System.out.println("Estado: "+objTarea.getEstado());
        
    }
    
}
