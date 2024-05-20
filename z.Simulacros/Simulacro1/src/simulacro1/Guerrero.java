/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro1;

/**
 *
 * @author JMart
 */
public class Guerrero extends Personaje{

    public Guerrero() {
        vida = 15;
        codigo = Integer.parseInt("2"+inicializador++);
        
    }

    @Override
    public String toString() {
        return "Guerrero: "+codigo+" vida: "+vida+"\n";
    }
    
}
