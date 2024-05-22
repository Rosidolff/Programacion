/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JMart
 */
public class AR12_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> lista = new ArrayList<>();
        
        
        for(int i =0;i<100;i++){
            lista.add((int)(Math.random()*100+1));
        }
        for (Integer elem : lista){
           for(int i=0; i<lista.size();i++){
               if(lista.get(i)%2==0){
                   System.out.println("Indice:"+i+" es par"+lista.get(i) );
                   lista.set(i, lista.get(i)*100);                   
               }
           }
        }
    
    }
    
    
}
