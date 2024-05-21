/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap12_2;

import java.util.Scanner;

/**
 *
 * @author DAW25
 */
public class AP12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Contenedor<Integer> conte = new Contenedor<>(new Integer[0]);
        int entrada = 0;
        System.out.println("Inserte numeros enteros positivos, use -1 para acabar de insertar:");

        System.out.print("Inserte el siguiente número:");
        entrada = sc.nextInt();
        while (entrada >= 0){
            conte.encolar(entrada);
            System.out.print("Inserte el siguiente número:");
            entrada = sc.nextInt();            
        } 
        
        System.out
                .println(conte);
        for (Integer objeto : conte.getObjetos()) {
            conte.desencolar();
        }
        System.out.println(conte);
    }

}
