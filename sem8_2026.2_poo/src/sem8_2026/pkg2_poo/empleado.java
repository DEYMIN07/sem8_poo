/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8_2026.pkg2_poo;

/**
 *
 * @author UCA40405
 */
public class empleado extends persona {
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void calcular_sueldo_mensual(int dias_faltados){
        double rpt=this.salario =((this.salario/30)*dias_faltados);
        System.out.println("el sueldo mensual es: "+rpt);
    }

    @Override
    public void ver_datos() {
       System.out.println("empleadfo nombre: " +this.nombre+" apellido materno: "
               + ""+this.ap_materno+" numero de documento: "+this.num_doc+" tipo "
                       + "de documento "+this.tipo_doc+" fecha de nacimiento: "
               +this.fecha_nac);
    }
    
    
}
