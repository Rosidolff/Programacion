/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro1;

/**
 *
 * @author JMart
 */
public class Jefe extends Personaje {

    int extra;

    public Jefe() {
        vida = 20;
        codigo = Integer.parseInt("1" + inicializador++);
        extra = codigo/2;
    }

    @Override
    public String toString() {
        return "Jefe: "+codigo+" vida: "+vida+" vida Extra: "+extra+"\n";
    }

}
