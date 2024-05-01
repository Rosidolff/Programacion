package a10_12;

import java.io.*;
import java.util.Scanner;

public class A10_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, texto;
        int edad;

        System.out.println("Introduzca su nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca su edad");
        edad = sc.nextInt();
        texto = "Nombre: " + nombre + " edad: " + edad;
        try (BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt", true))) {
            out.write(texto);
            out.newLine();
        } catch (IOException ex) {
            System.out.println(ex);

        }
        try (BufferedReader in = new BufferedReader(new FileReader("datos.txt"))) {
            String linea = in.readLine();
            while(linea!=null){
                            System.out.println(linea);
                            linea =in.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        } 
    }
}
