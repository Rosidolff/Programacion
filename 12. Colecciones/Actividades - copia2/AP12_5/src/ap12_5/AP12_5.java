/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap12_5;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author JMart
 */
public class AP12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Set<Clientes> cC = new TreeSet<>();

       
                
        cC.add(new Clientes(1,"paco",20));
        cC.add(new Clientes(2,"pepe",20));
        cC.add(new Clientes(3,"maria",24));
        cC.add(new Clientes(4,"cristina",30));
        Set<Clientes> c2 = new TreeSet<>((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));  
        c2.addAll(cC);
        Set<Clientes> c3 = new TreeSet<>((o1, o2) -> o1.getEdad()-o2.getEdad());
        c3.addAll(cC);
        System.out.println(cC);
        System.out.println(c2);
        System.out.println(c3);
        List<Clientes> listaca = new ArrayList<>();
        listaca.addAll(c3);
        System.out.println(listaca);
       
    }
    
}
