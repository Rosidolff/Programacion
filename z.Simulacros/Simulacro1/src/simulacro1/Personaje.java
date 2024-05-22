/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro1;

/**
 *
 * @author JMart
 */
public abstract class Personaje {
    static protected int inicializador=0;
   protected int codigo;
    protected int vida;

    @Override
    public String toString() {
        return "codigo: "+codigo+" vida: "+vida+"\n";
    }
    
}
