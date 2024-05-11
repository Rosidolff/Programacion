/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 *
 * @author JMart
 */
public class AR12_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Integer> cole = new ArrayList<>();
        Integer[] tabla;
        Integer[] tabla2;
        Comparator<Integer> ordenEnteros = Comparator.naturalOrder();
        Comparator<Integer> ordenDecreciente = Comparator.reverseOrder();
        
        for (int i = 0; i < 20; i++) {
            cole.add((int) (Math.random() * 100 + 1));
        }
        tabla = cole.toArray(new Integer[0]);
        Arrays.sort(tabla, ordenEnteros);
        cole.clear();
        cole.addAll(Arrays.asList(tabla));
        System.out.println(cole);
        Arrays.sort(tabla, ordenDecreciente);
        cole.clear();
        cole.addAll(Arrays.asList(tabla));
        System.out.println(cole);
    }

}
