/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author JMart
 */
public class AR12_11 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        Set<Socio> sSoc = new TreeSet<>();
        int opcion = 0;

        sSoc = abrirFichero(sSoc);
        do {
            pintaMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 ->
                    alta(sSoc);
                case 2 ->
                    baja(sSoc);
                case 3 -> {
                    System.out.println("Introduzca el dni del socio a modificar");
                    sSoc.remove(new Socio(sc.nextLine()));
                    alta(sSoc);
                }
                case 4 -> {
                    Comparator<Socio> oDni = (s1, s2) -> s1.compareTo(s2);
                    ArrayList<Socio> listaDni = new ArrayList<>(sSoc);
                    listaDni.sort(oDni);
                    System.out.println(listaDni);
                }
                case 5 -> {
                    Comparator<Socio> oAntiguedad = (s1, s2) -> s1.antiguedad() - s2.antiguedad();
                    ArrayList<Socio> listaAnt = new ArrayList<>(sSoc);
                    listaAnt.sort(oAntiguedad.reversed());
                    System.out.println(listaAnt);
                }
                case 6 -> {
                    System.out.println("Cerrando y guardando fichero");
                }
                default -> {
                    System.out.println("Opción no valida, introduzca una opción del menu.");
                }
            }
        } while (opcion != 6);

        guardarFichero(sSoc);
    }

    static void baja(Set<Socio> sSoc) {
        System.out.println("Introduzca el dni del socio para dar la baja");
        String salida = sSoc.remove(new Socio(sc.nextLine())) ? "Socio dado de baja con exito" : "Lo siento, no se reconoce el Dni";
        System.out.println(salida);
    }

    static void alta(Set<Socio> sSoc) {
        System.out.println("Introduzca los datos del nuevo socio (DNI, Nombre, Fecha de Alta(dd/MM/yyyy): ");
        sSoc.add(new Socio(sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }

    static void pintaMenu() {
        System.out.println("""
                                   Menu:
                                   1) Alta
                                   2) Baja
                                   3) Modificación
                                   4) Listado por Dni
                                   5) Listado por antigüedad
                                   6) Salir
                                   """);
    }

    static void guardarFichero(Set<Socio> sSoc) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
            out.writeObject(sSoc);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    static Set<Socio> abrirFichero(Set<Socio> sSoc) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Socios.dat"))) {
            sSoc = (TreeSet<Socio>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Archivo vacio, introduzca Socios");
        }
        return sSoc;
    }

}
