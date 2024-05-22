/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policias;

/**
 *
 * @author DAW25
 */
public class PoliciaTransito extends Policia {
    
    public PoliciaTransito(String nombre) {
        super(nombre);
        codigo= "T-"+codigo;
    }
    
    // actaulzarSueldo() -> +10% de las multas se sube a su sueldo.
    
}
