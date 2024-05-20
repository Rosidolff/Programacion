/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar12_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author JMart
 */
public class Sorteo<T> {
    Set<T> bombo;

    public Sorteo() {
        bombo = new TreeSet<>();
    }
    
    boolean add (T elem){        
    return bombo.add(elem);
    }
    
    Set<T> premiados (int cantidad){
        List<T> lista = new ArrayList<>(bombo);
        Set<T> premios = new TreeSet<>(bombo);
        Collections.shuffle(lista);
        if (cantidad<=bombo.size()){
            premios.clear();
           for(int i =0; i<cantidad;i++ ){
               premios.add(lista.get(i));
           } 
        }
        return premios;
    }
    
}
