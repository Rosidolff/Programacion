/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_21;

import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;
import java.util.Scanner;

public class AdA12_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite;
        Set<Integer> numeros = new TreeSet<>(Collections.reverseOrder()); //(o1, o2) -> o2 -o1;
        
        System.out.println("Introduzca el valor máximo de los numeros: ");
        limite = sc.nextInt();

        while (numeros.size() < 20) {
           numeros.add ((int) (Math.random() * limite));
        }
        System.out.println(numeros.size());
        System.out.println("Colección de números: " + numeros);
    }
}
