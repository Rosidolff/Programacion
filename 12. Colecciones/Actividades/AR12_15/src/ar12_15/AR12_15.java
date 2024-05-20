/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author JMart
 */
public class AR12_15 {

    static Scanner sc = new Scanner(System.in);
    static String entrada;
    static int c;
    static Map<String, Integer> rep = new HashMap<>();

    public static void main(String[] args) {
        cargaMapa();
        menu();

    }

    static void guardaMapa() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("repuestros.dat"))) {
            out.writeObject(rep);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    static void cargaMapa() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("repuestos.dat"))) {
            rep = (Map<String, Integer>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    static void menu() {
        int opcion = 0;
        while (opcion != 4) {
            pintarMenu();
            switch (opcion) {
                case 1 ->
                    alta();
                case 2 ->
                    baja();
                case 3 ->
                    actualizar();
                case 4 -> {
                    System.out.println("Saliendo y guardando. Adios");
                    guardaMapa();
                }
            }

        }
    }

    static void pintarMenu() {
        System.out.println("""
                                                      Introduzca una opción:
                                                      1) alta de repuesto
                                                      2) baja de repuesto
                                                      3) actualizar repuesto
                                                      4) salir
                                   """);
    }

    static void alta() {
        System.out.println("Introduzca la id del repuesto");
        entrada = sc.nextLine();

        if (rep.containsKey(entrada)) {
            System.out.println("Lo siento ese repuesto ya aparece en el registro, pulse 3 para actualizar su stock");
        } else {
            System.out.println("Introduzca la cantidad de stock del repuesto: " + entrada);
            c = sc.nextInt();
            sc.nextLine();
            rep.put(entrada, c);
        }
    }

    static void baja() {
        System.out.println("Introduzca la id del repuesto");
        entrada = sc.nextLine();
        if (!rep.containsKey(entrada)) {
            System.out.println("Lo siento ese repuesto no aparece en el registro");
        } else {
            rep.remove(entrada);
        }
    }

    static void actualizar() {
        System.out.println("Introduzca la id del repuesto");
        entrada = sc.nextLine();
        if (!rep.containsKey(entrada)) {
            System.out.println("Lo siento ese repuesto no aparece en el registro");
        } else {
            System.out.println("Introduzca la cantidad de stock del repuesto: " + entrada);
            c = sc.nextInt();
            sc.nextLine();
            rep.put(entrada, c);
        }
    }
}
