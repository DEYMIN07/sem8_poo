/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem8_2026.pkg2_poo;

import java.time.LocalDate;

/**
 *
 * @author UCA40405
 */
public class Sem8_20262_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        persona p1= new empleado();
        
        p1.setNombre("fredy");
        p1.setAp_materno("llanos");
        p1.setTipo_doc("DNI");
        p1.setNum_doc("71117956");
        p1.setFecha_nac(LocalDate.parse("2004-10-05"));
        
        persona_controlador cp1= new persona_controlador();
        cp1.agregar(p1);
        cp1.Listar();
                 
        
    }
    
}
