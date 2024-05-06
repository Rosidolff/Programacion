package ap10_4true;

import java.io.*;
import java.util.Scanner;

public class AP10_4true {

    public static void main(String[] args) {

        entrada();
        salida();
    }

    public static void salida() {
        String linea;
        Scanner sc;
        System.out.println("Usted ha escrito: ");
        try (BufferedReader in = new BufferedReader(new FileReader("bla.txt"))) {
            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea);
                System.out.println(sc.nextLine());
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void entrada() {
        String cad = "";
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter out = new BufferedWriter(new FileWriter("bla.txt"))) {
            System.out.println("Introduzca el texto, y escriba 'fin' para terminar");
            while (!cad.equals("fin")) {
                cad = sc.nextLine();
                out.write(cad);
                out.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
