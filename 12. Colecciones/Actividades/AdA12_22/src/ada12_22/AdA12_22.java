/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_22;

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class AdA12_22 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new LinkedHashSet<>();
        String nombre;

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (!(nombre = sc.nextLine().toLowerCase()).equals("fin")) {
            if (!nombres.contains(nombre)) {
                nombres.add(nombre);
            }
            System.out.println("Introduce el siguiente nombre:");
        }

        System.out.println("Colección de nombres: " + nombres);
    }
}