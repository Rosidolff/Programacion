/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r10_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW25
 */
public class R10_6 {
    public static void main(String[] args) {
        BufferedReader in = null;
        Scanner sc;
        String linea;
        int contador = 0;
        int suma = 0;
        double media;

        try {
            in = new BufferedReader(new FileReader("Enteros.txt"));
            linea = in.readLine();

            while (linea != null) {
                sc = new Scanner(linea);
                while (sc.hasNextInt()) {
                    suma += sc.nextInt();
                    contador++;
                }
                linea = in.readLine();
            }
            media = ((double) suma / contador);
            System.out.println("suma:" + suma + "\nMedia: " + media);

        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }

        }
    }

}
