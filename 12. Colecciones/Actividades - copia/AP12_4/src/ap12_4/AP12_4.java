/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JMart
 */
public class AP12_4 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Double> pos = new ArrayList<>();
        Collection<Double> neg = new ArrayList<>();
        double entrada, suma = 0;

        System.out.println("Introduce un numero real, inserte 0 para finalizar:");
        entrada = sc.nextDouble();
        while (entrada != 0) {
            if (entrada > 0) {
                pos.add(entrada);
            } else {
                neg.add(entrada);
            }
            System.out.println("siguiente número: ");
            entrada = sc.nextDouble();
        }
        for (double elem : pos) { //se puede hacer más facil metiendolo dentro del bucle while, pero quiero practicticar
            suma += elem;
        }
        for (double elem : neg) {
            suma += elem;
        }

        System.out.println(pos + "\n" + neg + "\n Suma Total: " + suma);
        Iterator<Double> it = pos.iterator();
        while (it.hasNext()) {
            if (it.next() > 10) {
                it.remove();
            }
        }
        it = neg.iterator();
        while (it.hasNext()) {
            if (it.next() < -10) {
                it.remove();
            }
        }
        System.out.println(pos + "\n" + neg );

    }

}
