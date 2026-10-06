/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8_2026.pkg2_poo;

import java.util.ArrayList;

/**
 *
 * @author UCA40405
 */
public class persona_controlador {
     ArrayList<persona> listapersonas = new ArrayList();

    public void agregar(persona p){
     listapersonas.add(p);
        System.out.println("persona agregada ");
    }  
   
     public void Listar(){
        System.out.println("__________lista de personas___________");
    for (persona p :listapersonas)
    {
    p.ver_datos();
    }
  } 
}
