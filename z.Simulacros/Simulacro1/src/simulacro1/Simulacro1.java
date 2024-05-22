/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro1;

import java.util.Scanner;

/**
 *
 * @author JMart
 */
public class Simulacro1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        Ejercito e1 = new Ejercito();
        Ejercito e2 = new Ejercito();
        int opcion;

        pintaMenu();
        opcion = sc.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1 ->
                    pintaEjercitos(e1, e2);
                case 2 -> {
                    e1.ataque();
                    if (e1.derrotado()) {
                        System.out.println("El ejercito 1 ha sido derrotado");
                        opcion = 0;
                    }
                }
                case 3 -> {
                    e2.ataque();
                    if (e2.derrotado()) {
                        System.out.println("El ejercito 2 ha sido derrotado");
                        opcion = 0;
                    }
                }
            }
            if (!e1.derrotado() && !e2.derrotado()) {
                pintaMenu();
                opcion = sc.nextInt();
            }
        }
        System.out.println("Gracias por jugar");
    }

    static void pintaMenu() {
        System.out.println("""
                                   Menu Simulacro de los Ejercitos v2 con Listas:
                                   1) Mostrar ejercitos
                                   2) Atacar al Ejercito 1
                                   3) Atacar al Ejercito 2
                                   0) Salir del programa.
                           Introduzca una opción:
                                   """);
    }

    private static void pintaEjercitos(Ejercito e1, Ejercito e2) {

        System.out.println("Ejercito1:\n" + e1.tropa);
        System.out.println("Ejercito2:\n" + e2.tropa);
    }

}
