/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policias;

/**
 *
 * @author JMart
 */
public class PoliciaTransito extends Policia {
    
    public PoliciaTransito(String nombre) {
        super(nombre);
        codigo= "T-"+codigo;
    }
    
    //actualizarSueldo()                  meter metodo para incrementar sueldo 10% de sus multas.
    
    
}
