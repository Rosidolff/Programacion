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
    
    static <U> Set<U> union (Set<U> c1, Set<U> c2){
        Set<U>c3 = new TreeSet<>(c1);
        c3.addAll(c2);
        return c3;
    }
        static <U> Set<U> interseccion (Set<U> c1, Set<U> c2){
                Set<U>c3 = new TreeSet<>(c1);
                c3.retainAll(c2);
                return c3;

    }
}
