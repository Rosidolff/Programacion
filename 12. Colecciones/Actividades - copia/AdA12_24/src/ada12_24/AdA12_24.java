/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class AdA12_24 {

    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> lista2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> listaFusionada = fusionarListas(lista1, lista2);

        System.out.println("Lista fusionada: " + listaFusionada);
    }

    public static List<Integer> fusionarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> fusionada = new ArrayList<>();
        int ind1 = 0, ind2 = 0;
        //rehacer usando un algoritmo que nos sirva para ordenar los dos arrays aprovechando que estan ordenados sin un sort.

        while (ind1 < lista1.size() && ind2 < lista2.size()) {
            if (lista1.get(ind1) <= lista2.get(ind2)) {
                fusionada.add(lista1.get(ind1));
                ind1++;
            } else {
                fusionada.add(lista2.get(ind2));
                ind2++;
            }
        }
        while (ind1 < lista1.size()) {
            fusionada.add(lista1.get(ind1));
            ind2++;
        }
        while (ind2 < lista2.size()) {
            fusionada.add(lista2.get(ind2));
            ind2++;
        }

        return fusionada;
    }
}
