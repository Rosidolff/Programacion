/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_37;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author JMart
 */
public class AdA12_37 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Jugador> equipo = new TreeMap<>();
//        altaJugador(equipo, 1);
//        altaJugador(equipo, 2);
//        altaJugador(equipo, 3);
//        altaJugador(equipo, 4);
//        altaJugador(equipo, 5);
//        altaJugador(equipo, 6);
//        altaJugador(equipo, 7);
//        altaJugador(equipo, 8);

    equipo.put(1, new Jugador("123","Mariano",1.80,"portero"));
    equipo.put(2, new Jugador("124","Maria",1.82,"delantero"));
    equipo.put(3, new Jugador("125","Mar",1.85,"centrocampista"));
    equipo.put(4, new Jugador("126","Marla",1.90,"defensa"));
    equipo.put(5, new Jugador("127","Marisa",2.00,"portero"));
    
        eliminarJugador(equipo, 3);

        mostrar(equipo);
        editarJugador(equipo, 5);
        mostrar(equipo, "PORTERO");

    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        String dni, nombre, posicion;
        double altura;
        System.out.println("Introduzca el nombre del jugador del dorsal:" + dorsal);
        nombre = sc.nextLine();
        System.out.println("Introduzca el DNI del jugador del dorsal:" + dorsal);
        dni = sc.nextLine();
        System.out.println("Introduzca la Posicion del jugador del dorsal:" + dorsal);
        posicion = sc.nextLine();
        System.out.println("Introduzca la altura del jugador del dorsal:" + dorsal);
        altura = sc.useLocale(Locale.US).nextDouble();
        sc.nextLine();
        plantilla.put(dorsal, new Jugador(dni, nombre, altura, posicion));
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        System.out.println(plantilla);
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        posicion=posicion.toUpperCase();
        Set<Map.Entry<Integer, Jugador>> mostrar = plantilla.entrySet();
        for (Map.Entry<Integer, Jugador> jugador : mostrar) {
            if (jugador.getValue().getPosicion().toString().equals(posicion)) {
                System.out.println(jugador);
            }
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        String nombre, posicion, dni;
        double altura;
        boolean existe = false;

        if (plantilla.containsKey(dorsal)) {
            existe = true;
        }
            System.out.println("Introduzca el nombre del jugador del dorsal:" + dorsal);
            nombre = sc.nextLine();
            System.out.println("Introduzca la Posicion del jugador del dorsal:" + dorsal);
            posicion = sc.nextLine();
            System.out.println("Introduzca la altura del jugador del dorsal:" + dorsal);
            altura = sc.useLocale(Locale.US).nextDouble();
            sc.nextLine();
            dni = plantilla.get(dorsal).getDni();
            plantilla.put(dorsal, new Jugador(dni, nombre, altura, posicion));
        
        return existe;
    }

}
