/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r10_5;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DAW25
 */
public class R10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        double num;
        double suma = 0;
        try (BufferedReader in = new BufferedReader(new FileReader("reales.txt"))) {
            String linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                if (sc.hasNextDouble()) {
                    num = sc.nextDouble();
                    suma += num;
                }
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("Suma:"+suma );
    }
    

}
