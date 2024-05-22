/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author JMart
 */
public class AR12_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<Character, Academico> sillones = new HashMap<>();

        sillones.put('G', new Academico("Pilar", 2014));
        sillones.put('R', new Academico("Mario", 2008));
        sillones.put('K', new Academico("Soledad", 2012));
        sillones.put('C', new Academico("Luis", 1995));
        sillones.put('e', new Academico("Clara", 2003));
        System.out.println(sillones);
        Set<Map.Entry<Character, Academico>> oNombre = sillones.entrySet();
        List<Map.Entry<Character, Academico>> lista = new ArrayList<>(oNombre);
        lista.sort((o1, o2) -> o1.getValue().getNombre().compareTo(o2.getValue().getNombre()));
        System.out.println(lista);
        lista.sort((o1, o2) -> o1.getValue().getIngreso() - o2.getValue().getIngreso());
        System.out.println(lista);

    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        if (Character.isLetter(letra)) {
            academia.put(letra, nuevo);
            return true;
        }
        return false;

    }

}
