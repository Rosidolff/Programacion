package ar10_8;

import java.io.*;
import java.util.Scanner;

public class AR10_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fichero;
        String cad;
        System.out.println("Diga el nombre del archivo:");
        fichero = sc.nextLine();

        try (BufferedWriter out = new BufferedWriter(new FileWriter("copia_de_" + fichero)); BufferedReader in = new BufferedReader(new FileReader(fichero))) {
            cad = in.readLine();
            while (cad != null) {
                out.write(cad);
                out.newLine();
                cad = in.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
