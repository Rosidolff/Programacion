package policias;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JMart
 */
public class Multa implements Comparable<Multa> {

    static private int cont = 100;
    static private Map<String, HashSet<Multa>> mapa = new HashMap<>();
    private String codigo;
    private double importe;

    public Multa(double importe) {
        codigo = "M-" + cont++;
        this.importe = importe;
    }

    @Override
    public int compareTo(Multa o) {
        return codigo.compareTo(o.codigo);
    }

    public static boolean introducirMulta(String poli, Multa m) {
        return mapa.get(poli).add(m);

    }

    public static boolean eliminarTodaMultas(String poli) {
        boolean eliminado = false;
        if (mapa.containsKey(poli)) {
            mapa.get(poli).clear();
            eliminado = true;
        }
        return eliminado;
    }

    public static int numeroMultasTotal() {
        int cont=0;
        for (HashSet<Multa> m : mapa.values()){
            cont+=m.size();
        }
        return cont;        
    }

    public static Set<String> policiasConMultas() {
        String codigo;
        Set<String> polis = new HashSet<>(mapa.keySet());
        Iterator<String> it = polis.iterator();
        while(it.hasNext()){
            codigo = it.next();
            if (mapa.get(codigo).isEmpty()){
                it.remove();
            }
        }
        return polis;
    }

    public static Iterator<Multa> multasPolicia(String poli) {
        return mapa.get(poli).iterator();
    }

}
