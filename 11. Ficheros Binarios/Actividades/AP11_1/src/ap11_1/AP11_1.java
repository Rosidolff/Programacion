package ap11_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AP11_1 {

    public static void main(String[] args) {
        int[] t = {3, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            out.writeObject(t);

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
