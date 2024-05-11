/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_4bis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author JMart
 */
public class AR12_4bis {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        Collection<Integer> numeros = new ArrayList<>();
        
        
        System.out.println("Introduzca un número entero no negativo, para salir introduzca -1:");
        System.out.println("siguiente número:");
        num = sc.nextInt();
        while (num > 0) {
            numeros.add(num);
            System.out.println("siguiente número:");
            num = sc.nextInt();
        }
        
        for (int numero : numeros){
            if (numero%2==0){
                System.out.print(numero+", ");
            }
        }
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()){
            if (it.next()%3==0){
                it.remove();
            }
        }
        System.out.println(numeros);
    }

}
