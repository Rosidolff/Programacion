/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author JMart
 */
public class AR12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Integer> lista = new ArrayList<>();
        Collection<Integer> listaSinrepe = new ArrayList < > ();
        for (int i = 0; i < 10; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        for (int elem : lista){
            if (!listaSinrepe.contains(elem)){
                listaSinrepe.add(elem);
            }
        }
    }

}
