/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_12;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author JMart
 */
public class AR12_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }
    static <E> Set<E> union (Set<E> oC1, Set<E> oC2){ 
        Set<E> oC3 = new TreeSet<>(oC1);
        oC3.addAll(oC2);
        return oC3;
    }
        static <E> Set<E> interseccion (Set<E> oC1, Set<E> oC2){ 
        Set<E> oC3 = new TreeSet<>(oC1);
        oC3.retainAll(oC2);
        return oC3;
    }
}


