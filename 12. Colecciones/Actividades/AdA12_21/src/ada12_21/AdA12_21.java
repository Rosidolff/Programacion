/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_21;

import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;

public class AdA12_21 {

    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>(Collections.reverseOrder());

        while (numeros.size() < 20) {
            int num = (int) (Math.random() * 100);
            numeros.add(num);
        }

        System.out.println("Colección de números: " + numeros);
    }
}
