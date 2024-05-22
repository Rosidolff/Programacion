/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_7;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author JMart
 */
public class AR12_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Integer> cole = new ArrayList<>();
        Collection<Integer> cincos = new ArrayList<>();
        cincos.add(5);
        for (int i = 0; i < 100; i++) {
            cole.add((int) (Math.random() * 10 + 1));
        }
        cole.removeAll(cincos);
        System.out.println(cole);
    }

}
