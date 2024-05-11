
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JMart
 * @param <T>
 */
public class Sorteo<T> {
    private Set<T> bombo; 

    public Sorteo() {
        bombo = new HashSet<>(); 
    }
    boolean add(T papeleta){
        return bombo.add(papeleta);
    }
    Set<T> premiados (int cantidadPremios){
        
        for(int i=0; i<cantidadPremios;i++){
            
        }
    }
    
}
