/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_25;

import java.io.*;
import java.util.*;

public class AdA12_25 {
    
 static Map<String, Socio> socios = new HashMap<>();
 static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {        
        int opcion;
        String dni, nombre, fIngreso, anio;

        cargarDatos();
        do {
            System.out.println("""
                Menú:
                1. Alta socio.
                2. Baja socio.
                3. Modificación socio.
                4. Listar socios por DNI.
                5. Listar socios por antigüedad.
                6. Listar los socios con alta anterior a un año determinado.
                7. Salir.
                """);
            opcion = sc.nextInt();
            sc.nextLine(); // Consume el salto de línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce DNI: ");
                    dni = sc.nextLine();
                    System.out.print("Introduce nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Introduce fecha de ingreso (dd/MM/yyyy): ");
                    fIngreso = sc.nextLine();
                    altaSocio(dni, nombre, fIngreso);
                }
                case 2 -> {
                    System.out.print("Introduce DNI: ");
                    dni = sc.nextLine();
                    bajaSocio(dni);
                }
                case 3 -> {
                    System.out.print("Introduce DNI: ");
                    dni = sc.nextLine();
                    System.out.print("Introduce nuevo nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Introduce nueva fecha de ingreso (dd/MM/yyyy): ");
                    fIngreso = sc.nextLine();
                    modificacionSocio(dni, nombre, fIngreso);
                }
                case 4 ->
                    listarSociosPorDNI();
                case 5 ->
                    listarSociosPorAntiguedad();
                case 6 -> {
                    System.out.print("Introduce año: ");
                    anio = sc.nextLine();
                    listarSociosPorAno(anio);
                }
                case 7 -> {
                    System.out.println("Guardando datos y saliendo...");
                    guardarDatos();
                }
                default ->
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    public static void altaSocio(String dni, String nombre, String fIngreso) {
        socios.put(dni, new Socio(dni, nombre, fIngreso));
    }

    public static void bajaSocio(String dni) {
        socios.remove(dni);
    }

    public static void modificacionSocio(String dni, String nuevoNombre, String nFIngres) {
        if (socios.containsKey(dni)) {
            socios.put(dni, new Socio(dni, nuevoNombre, nFIngres));
        }
    }

    public static void listarSociosPorDNI() {
        socios.forEach((dni, socio) -> System.out.println(dni + ": " + socio));
    }

    public static void listarSociosPorAntiguedad() {
        List<Socio> listaSocios = new ArrayList<>(socios.values());
        listaSocios.sort(Comparator.comparing(Socio::antiguedad).reversed());
        listaSocios.forEach(System.out::println);
    }

    public static void listarSociosPorAno(String ano) {
        int year = Integer.parseInt(ano);
        List<Socio> listaSocios = new ArrayList<>(socios.values());
        for (Socio socio : listaSocios) {
            if (socio.getFnac().getYear() <= year) {
                System.out.println(socio);
            }
        }
    }

    private static void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("club.dat"))) {
            out.writeObject(socios);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
        }
    }

    private static void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("club.dat"))) {
            socios = (Map<String, Socio>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos.");
        }
    }

}
