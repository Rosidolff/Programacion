/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author JMart
 */
public class AR12_4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num;
        Collection<Integer> lista = new ArrayList<>();

        System.out.println("Introduzca un numero entero no negativo, introduzca -1 para terminar");
        num = sc.nextInt();
        while (num >= 0) {
            lista.add(num);
            System.out.println("Introduzca un numero entero no negativo, introduzca -1 para terminar");
            num = sc.nextInt();
        }
        System.out.println(lista);
        for (Integer elem : lista) {
            if (elem % 2 == 0) {
                System.out.print(elem + ", ");
            }
        }
        System.out.println("");
//        for (Integer elem : lista) {
//            if (elem % 3 == 0) {
//                lista.remove(elem);
//            }
//        }
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next() % 3 == 0) {
                it.remove();
            }
        }
        System.out.println(lista);
    }

}
