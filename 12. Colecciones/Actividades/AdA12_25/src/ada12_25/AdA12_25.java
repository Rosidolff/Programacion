/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author JMart
 */
public class AdA12_25 {

    static Scanner sc = new Scanner(System.in);
    static Map<String, Socio> gl = new HashMap<>();

    public static void main(String[] args) {
        int opcion;
        gl = abreGl();

        pintaMenu();
        opcion = sc.nextInt();
        sc.nextLine();
        while (opcion != 7) {
            switch (opcion) {
                case 1 ->
                    alta();
                case 2 ->
                    baja();
                case 3 ->
                    modificar();
                case 4 ->
                    listarApodo();
                case 5 ->
                    listarAntiguedad();
                case 6 ->
                    listarPorAnio();
                case 7 ->
                    System.out.println("Saliendo del programa, guardando modificaciones");
            }

            pintaMenu();
            opcion = sc.nextInt();
            sc.nextLine();
        }

        cierraGl();

    }

    static void pintaMenu() {
        System.out.println("""
                                    Menu:
                                   1) Alta Socio
                                   2) Baja Socio
                                   3) Modificar Socio
                                   4) Listar Socios por apodo
                                   5) Listar Socios por Antigüedad
                                   6) Listar Socios con alta anterior al año (introduzca un año):
                                   7)
                                            """);
    }

    static void cierraGl() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
            out.writeObject(gl);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    static Map<String, Socio> abreGl() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            gl = (Map<String, Socio>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return gl;
    }

    private static void alta() {
        String apodo, nombre, fecha;
        System.out.println("Introduzca el apodo que desea dar de alta");
        apodo = sc.nextLine();
        if (gl.containsKey(apodo)) {
            System.out.println("Lo siento, ese apodo ya está en uso");
        } else {
            System.out.println("Introduzca el nombre y fecha de Inscripción:\nNombre:");
            nombre = sc.nextLine();
            System.out.println("Fecha de alta 'dd/MM/yyyy':");
            fecha = sc.nextLine();
            gl.put(apodo, new Socio(nombre, fecha));
        }
    }

    private static void baja() {
        String apodo;
        System.out.println("Introduzca el apodo que desea dar de baja");
        apodo = sc.nextLine();
        if (!gl.containsKey(apodo)) {
            System.out.println("Lo siento, ese apodo no está en uso");
        } else {
            gl.remove(apodo);
        }
    }

    private static void modificar() {
        String apodo, nombre, fecha;
        System.out.println("Introduzca el apodo que desea modificar");
        apodo = sc.nextLine();
        if (!gl.containsKey(apodo)) {
            System.out.println("Lo siento, ese apodo no está en uso");
        } else {
            System.out.println("Introduzca el nuevo nombre y fecha de Inscripción:\nNombre:");
            nombre = sc.nextLine();
            System.out.println("Fecha de alta 'dd/MM/yyyy':");
            fecha = sc.nextLine();
            gl.put(apodo, new Socio(nombre, fecha));
        }
    }

    private static void listarApodo() {
        Set<Map.Entry<String, Socio>> cApodo = gl.entrySet();
        List<Map.Entry<String, Socio>> lApodo = new ArrayList<>(cApodo);
        lApodo.sort((a1, a2) -> a1.getKey().compareTo(a2.getKey()));
        System.out.println(lApodo);
    }

    private static void listarAntiguedad() {
        Set<Map.Entry<String, Socio>> cAnt = gl.entrySet();
        List<Map.Entry<String, Socio>> lAnt = new ArrayList<>(cAnt);
        lAnt.sort((a1, a2) -> a1.getValue().fi.compareTo(a2.getValue().fi));
        System.out.println(lAnt);
    }

    private static void listarPorAnio() {
        Set<Map.Entry<String, Socio>> conjunto = gl.entrySet();
        List<Map.Entry<String, Socio>> lista = new ArrayList<>(conjunto);
        int anio;
        System.out.println("Introduzca el año que quiere consultar: ");
        anio = sc.nextInt();
        sc.nextLine();
        Iterator<Map.Entry<String, Socio>> it = lista.iterator();
        while(it.hasNext()){
            if(it.next().getValue().fi.getYear()>anio){
                it.remove();
            }
        }
        System.out.println(lista);
    }

}
