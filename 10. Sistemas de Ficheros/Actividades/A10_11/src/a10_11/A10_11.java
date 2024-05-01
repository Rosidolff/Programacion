package a10_11;

import java.io.*;
import java.util.Scanner;

public class A10_11 {

    public static void main(String[] args) {
        String fichero;
        Scanner sc = new Scanner(System.in);
        BufferedReader in = null;
        String texto = "";
        System.out.println("Introduzca el nombre del fichero que quiere leer:");

        fichero = sc.nextLine();

        try {
            in = new BufferedReader(new FileReader(fichero + ".txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea + "\n";
                linea = in.readLine();
            }
        } catch (IOException ex) {
            try {
                in = new BufferedReader(new FileReader("prueba.txt"));
                String linea = in.readLine();
                while (linea != null) {
                    texto += linea + "\n";
                    linea = in.readLine();
                }
            } catch (IOException x) {
                System.out.println(x);
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        System.out.println(texto);
    }

}
