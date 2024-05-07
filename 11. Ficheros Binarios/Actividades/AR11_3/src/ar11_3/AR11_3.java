package ar11_3;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class AR11_3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int contador;
        System.out.println("Introduzca cuandos numeros va a introducir");
        contador = sc.nextInt();
        double[] tabla = new double[contador];
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduzca el siguiente double");
            tabla[i] = sc.useLocale(Locale.US).nextDouble();

        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numericos.txt"))) {
            out.writeObject(tabla);

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
