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
        List<Integer> fusionada = new ArrayList<>(lista1);
        fusionada.addAll(lista2);
        Collections.sort(fusionada);
        return fusionada;
    }
}