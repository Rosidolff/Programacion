/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada12_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdA12_26 {

    public static void main(String[] args) {
        List<String> alumnos = Arrays.asList("Pepe", "Rigoberto", "Manue", "Rafael", "MariCarmen", "LaLoli", "Luisa", "Ramona");
        int numGrupos = 3;

        List<List<String>> grupos = reparteAlumnos(alumnos, numGrupos);

        for (int i = 0; i < grupos.size(); i++) {
            System.out.println("Grupo " + (i + 1) + ": " + grupos.get(i));
        }
    }

    public static List<List<String>> reparteAlumnos(List<String> lista, int numGrupos) {
        List<List<String>> grupos = new ArrayList<>();
        Collections.shuffle(lista);

        for (int i = 0; i < numGrupos; i++) {
            grupos.add(new ArrayList<>());
        }

        for (int i = 0; i < lista.size(); i++) {
            grupos.get(i % numGrupos).add(lista.get(i));
        }
        return grupos;
    }
}
