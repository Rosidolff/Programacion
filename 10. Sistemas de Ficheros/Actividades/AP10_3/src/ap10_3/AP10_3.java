package ap10_3;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class AP10_3 {

    public static void main(String[] args) {
        String nombre;
        int edad;
        double estatura;
        Scanner sc = new Scanner(System.in);

        String linea;
        int sumaEdad = 0, cont = 0;
        double sumaEstatura = 0, mediaEdad, mediaEstatura;

        System.out.println("Introduzca el nombre del jugador:");
        nombre = sc.nextLine();
        System.out.println("Introduzca la edad del jugador:");
        edad = sc.nextInt();
        System.out.println("Introduzca la estatura del jugador:");
        estatura = sc.useLocale(Locale.US).nextDouble();

        try (BufferedWriter out = new BufferedWriter(new FileWriter("Jugadores.txt", true))) {
            out.write(nombre + " " + edad + " " + estatura);
            out.newLine();
        } catch (IOException ex) {
            System.out.println(ex);

        }

        try (BufferedReader in = new BufferedReader(new FileReader("Jugadores.txt"))) {
            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea);
                nombre = sc.next();
                edad = sc.nextInt();
                estatura = sc.useLocale(Locale.US).nextDouble();
                sumaEdad += edad;
                sumaEstatura += estatura;
                System.out.println("Nombre: " + nombre+ " edad: "+edad+" estatura: "+estatura);
                cont++;
                linea = in.readLine();
            }

        } catch (IOException x) {
            System.out.println(x);
        }
        mediaEdad= (double)sumaEdad/cont;
        mediaEstatura= sumaEstatura/cont;
        System.out.println("Media Edad:"+mediaEdad+ " \nMedia Estatura: "+mediaEstatura+" \nSuma Edad: "+sumaEdad+" \nsumaEstatura: "+sumaEstatura);

    }
}
