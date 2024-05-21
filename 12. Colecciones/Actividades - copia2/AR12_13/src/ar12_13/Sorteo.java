package ar12_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JMart
 * @param <T>
 */
public class Sorteo<T> {

    private Set<T> bombo;

    public Sorteo() {
        bombo = new HashSet<>();
    }

    boolean add(T papeleta) {
        return bombo.add(papeleta);
    }

    Set<T> premiados(int cantidadPremios) {
        Set<T> premios = null;
        if (cantidadPremios > bombo.size()) {
            System.out.println("No hay suficientes papeletas para la cantidad de premios solicitados.");
        } else {
            List<T> listaBombo = new ArrayList<>(bombo); // Convertimos el Set a List para barajar
            Collections.shuffle(listaBombo); // Barajamos la lista

            premios = new HashSet<>();
            Iterator<T> it = listaBombo.iterator();
            for (int i = 0; i < cantidadPremios; i++) {
                premios.add(it.next());
            }
        }
        return premios;
    }

    @Override
    public String toString() {
        return bombo.toString();
    }

}
