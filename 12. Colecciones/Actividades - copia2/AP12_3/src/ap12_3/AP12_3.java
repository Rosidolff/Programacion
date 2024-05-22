/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap12_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author JMart
 */
public class AP12_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection <Integer> cincos = new ArrayList<>();
        cincos.add(5);
        Collection <Integer> cole = new ArrayList<>();
        for (int i=0; i<100;i++){
            cole.add((int)(Math.random()*10+1));
        }
        System.out.println(cole);
        
        cole.removeAll(cincos);
        System.out.println(cole);
    }
    
}
