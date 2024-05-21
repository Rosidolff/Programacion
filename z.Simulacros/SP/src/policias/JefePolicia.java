/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policias;

/**
 *
 * @author JMart
 */
public class JefePolicia extends Policia {
    
    public JefePolicia(String nombre) {
        super(nombre);
        codigo="J-"+codigo;
        sueldo+=1000;
    }
    
}
