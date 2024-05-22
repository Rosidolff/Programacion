/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author JMart
 */
public class AR12_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Collection<Integer> cole = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cole.add((int) (Math.random() * 10 + 1));
        }
        Iterator<Integer> it = cole.iterator();
        while (it.hasNext()) {
            if (it.next() == 5) {
                it.remove();
            }
        }
        System.out.println(cole);
    }

}
