/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package embarcaciones;

/**
 *
 * @author DAW25
 */
public class Acorazado extends Barco {
    private static int num=1;
    private int can;

    public Acorazado(double longitud, int can) {
        super("Ac-"+Integer.toString(num), longitud);
        this.can = can;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Acorazado.num = num;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    @Override
    public String toString() {
        return super.toString()+" NºCañones: "+can;
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        if ((obj instanceof Acorazado) && ((Acorazado)obj).codigo.equals(codigo)){
        iguales = true;
    }
        return iguales;
    }

}
