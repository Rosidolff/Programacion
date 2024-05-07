package ar11_1;

import java.io.*;

public class AR11_1 {

    public static void main(String[] args) {
        int[] t = {3, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            for (int n : t) {
                out.writeInt(n);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
