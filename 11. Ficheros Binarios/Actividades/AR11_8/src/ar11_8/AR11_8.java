/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar11_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAW25
 */
public class AR11_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio socio1 = new Socio("pepe");
        Socio socio2 = new Socio("manoli");
        Socio socio3 = new Socio("marivi");
        Socio socio4 = new Socio("isa");
        Socio[] lista = new Socio[]{socio1, socio2, socio3, socio4};
        Socio[] listaDevuelta = null;
        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
            in.writeObject(lista);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            listaDevuelta = (Socio[]) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        System.out.println(Arrays.deepToString(listaDevuelta));

    }

}
