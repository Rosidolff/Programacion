/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_23;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class AdA12_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new TreeSet<>();
        String nombre;

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (!(nombre = sc.nextLine().toLowerCase()).equals("fin")) {
            nombres.add(nombre);
            System.out.println("Introduce el siguiente nombre:");
        }

        System.out.println("Colección de nombres: " + nombres);
    }
}