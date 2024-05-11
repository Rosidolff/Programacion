/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap12_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author JMart
 */
public class AP12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Cliente> cCli = new ArrayList<>();
        cCli.add(new Cliente("1", "Marta", "12/02/2000"));
        cCli.add(new Cliente("2", "Jorge", "16/03/1999"));
        cCli.add(new Cliente("3", "Carlos", "12/02/2002"));

        Comparator<Cliente> oEdad = new Comparator<>() {
            public int compare(Cliente c1, Cliente c2) {
                return c1.getFnac().compareTo(c2.getFnac());
            }
        };
        Comparator<Cliente> oNombre = (c1, c2) -> c1.getNombre().compareTo(c2.getNombre()); //version con lambda

        cCli.sort(oEdad);
        System.out.println(cCli);
        cCli.sort(oNombre);
        System.out.println(cCli);

    }

}
