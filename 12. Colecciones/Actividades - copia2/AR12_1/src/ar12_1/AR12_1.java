/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_1;

import java.util.Arrays;

/**
 *
 * @author JMart
 */
public class AR12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public <U> U[] insertarobjeto(U[] tabla, U o) {
        tabla = Arrays.copyOf(tabla, tabla.length+1);
        tabla[tabla.length-1] = o;
        
        return tabla;
    }
}
