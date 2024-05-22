/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

/**
 *
 * @author JMart
 */
public class Jefe extends Personaje {

   private int extra;

    public Jefe() {
        vida = 20;
        codigo = Integer.parseInt("1" + inicializador++);
        extra = codigo/2;
    }

    @Override
    public String toString() {
        return super.toString()+" Vida Extra: "+extra;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

}
