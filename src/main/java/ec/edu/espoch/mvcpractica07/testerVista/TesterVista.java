/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.mvcpractica07.testerVista;

import ec.edu.espoch.mvcpractica07.Vista.Vista;

/**
 *
 * @author USUARIO
 */
public class TesterVista {

    private Vista vista;

    public TesterVista(Vista vista) {
        this.vista = new Vista();
    }

    public void prueba() {
        try {
            System.out.println("Titulo" + vista.getTxtTitulo());
            System.out.println("Descripcion" + vista.getTxtDescripcion());
            System.out.println("Estado" + vista.getEstado());

        } catch (NumberFormatException e) {

        }
    }

}
