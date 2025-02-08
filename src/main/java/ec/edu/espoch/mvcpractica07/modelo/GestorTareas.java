/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.mvcpractica07.modelo;

/**
 *
 * @author SO-LAB1-PC28
 */
   
public class GestorTareas {
    int tamañoVector =5;
    Tarea[] tareas= new Tarea [tamañoVector];
    
    public String agregarTarea ( Tarea tarea){
        int cont=0;
        String msg ="Ingreso exitoso";
        Tarea[] tareas = new Tarea[5];
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i]== null) {
                tareas [i].setId(i++);
                tareas [i].setTitulo(tarea.getTitulo());
                tareas [i].setDescripcion(tarea.getDescripcion());
                tareas [i].setEstado(tarea.isEstado());
            }else{
                cont++;
            }
         
            
        }
        if (cont==tareas.length) {
            msg="El vector esta lleno";
            
        }
        return msg;
    }
    
    
    public Tarea[] listarTarea(){
        Tarea[] auxTareas= new Tarea[tamañoVector];
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i].isEstado()) {
                auxTareas[i].setId(tareas[i].getId());
                auxTareas[i].setTitulo(tareas[i].getTitulo());
                auxTareas[i].setDescripcion(tareas[i].getDescripcion());
                auxTareas[i].setEstado(tareas[i].isEstado());
              
            }
           
            
        } return auxTareas;
    }
}
