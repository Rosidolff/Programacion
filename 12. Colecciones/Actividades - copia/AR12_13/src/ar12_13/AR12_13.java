/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_13;

import java.util.Set;

/**
 *
 * @author JMart
 */
public class AR12_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sorteo<Integer> tombola = new Sorteo<>();
        for(int i=1;i<25;i++){
            tombola.add(i);
        }
        System.out.println(tombola);
        Set<Integer> premios = tombola.premiados(3);
        System.out.println(premios);
        

    }

}
