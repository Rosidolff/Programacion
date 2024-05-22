/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package embarcaciones;

/**
 *
 * @author DAW25
 */
public class Submarino extends Barco {

    private static int num = 1;
    public Submarino(double longitud) {
        super("Sub-" + Integer.toString(num), longitud);
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Submarino.num = num;
    }

    public double getPeriscopio() {
        return longitud/10;
    }


    @Override
    public String toString() {
        return super.toString()+" Periscopio: "+this.getPeriscopio();
    }
    
    

}
