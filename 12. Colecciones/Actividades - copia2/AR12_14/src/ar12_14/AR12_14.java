/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JMart
 */
public class AR12_14 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Registro> temperaturas = new ArrayList<>();
        int opcion = 0;
        do {
            pintaMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introducir temperatura: ");
                    double temperatura = new Scanner(System.in).useLocale(Locale.US).nextDouble();
                    temperaturas.add(new Registro(temperatura));
                }
                case 2 ->
                    System.out.println(temperaturas);
                case 3 -> {
                    Comparator<Registro> c = (r1, r2) -> Double.compare(r1.temperatura, r2.temperatura);

                    System.out.println("Máxima: " + Collections.max(temperaturas, c));
                    System.out.println("Mínima: " + Collections.min(temperaturas, c));

                    double suma = 0;
                    for (Registro t : temperaturas) {
                        suma += t.temperatura;
                    }
                    System.out.println("Media: " + suma / temperaturas.size());
                }
                case 4 -> {
                    System.out.println("Cerrando y guardando fichero");
                    String nombreArchivo = "registros";
                    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
                    nombreArchivo += LocalDate.now().format(f);
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
                        out.writeObject(temperaturas);
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex);
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
            }
        }
        
    }
    while (opcion != 4);
    }

    static void pintaMenu() {
        // TODO code application logic here
        System.out.println("""
                                   Menu:
                                   1. Nuevo registro
                                   2. Listar registros
                                   3. Mostrar esdísticas (max, min, promedio)
                                   4. sair
                                   """);
    }

}
