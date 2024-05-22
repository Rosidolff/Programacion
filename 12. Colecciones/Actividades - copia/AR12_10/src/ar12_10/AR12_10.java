/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author JMart
 */
public class AR12_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> lista = new ArrayList<>();
        Set<Integer> sinR = new TreeSet<>();
        Set<Integer> repes = new TreeSet<>();
        Set<Integer> unicos = new TreeSet<>();

        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        Comparator<Integer> cNatural = Comparator.naturalOrder();
        lista.sort(cNatural);
        System.out.println(lista);
        sinR.addAll(lista);
        System.out.println(sinR);
        for (Integer elem : sinR) {
            lista.remove(elem);
        }
        repes.addAll(lista);
        System.out.println(repes);
        unicos.addAll(sinR);
        unicos.removeAll(repes);
        System.out.println(unicos);
        System.out.println(sinR);

    }

}
