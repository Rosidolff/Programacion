package ar11_7;

import java.io.*;
import java.util.Scanner;

public class AR11_7 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fichero.dat"))) {
            System.out.println("Introduce un número");
            num = sc.nextInt();
            while (num != -1) {
                out.writeInt(num);
                System.out.println("Introduce un número");
                num = sc.nextInt();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("fichero.dat")); ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("copia.dat"))) {

            while (in.available() > 0) {
                num = in.readInt();
                System.out.println("Numero: " + num);
                out.writeInt(num);
            }
        } catch (IOException x) {
            System.out.println(x);
        }
    }

}
