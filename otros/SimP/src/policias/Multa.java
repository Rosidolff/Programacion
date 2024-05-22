/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policias;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DAW25
 */
public class Multa implements Comparable<Multa> {

    private String codigo;
    private static int contador = 100;
    private double importe;
    private static Map<String, TreeSet<Multa>> mapa = new HashMap<>();

    public Multa(double importe) {
        this.codigo = "T-" + contador++;
        this.importe = importe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Multa.contador = contador;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Codigo Multa: " + codigo + " importe: " + importe;
    }

    @Override
    public int compareTo(Multa o) {
        return codigo.compareTo(o.codigo);
    }

    public static boolean introducirMulta(String codigo, Multa m) {
        boolean insertada = true;
        Iterator<Multa> it = mapa.get(codigo).iterator();
        while (!insertada && it.hasNext()) {
            if (it.next().equals(m)) {
                insertada = false;
            }
        }
        if (insertada) {
            mapa.get(codigo).add(m);
        }
        return insertada;
    }

    public static boolean eliminarTodaMultas(String codigo) {
        boolean elimina = false;
        if (!mapa.containsKey(codigo)) {
            elimina = true;
            mapa.get(mapa).clear();
        }
        return elimina;
        
    }

    public static int numeroMultasTotal() {
        int contador=0;
       Set<Map.Entry<String, TreeSet<Multa>>> conjunto = mapa.entrySet();
        Iterator<Map.Entry<String, TreeSet<Multa>>> it = conjunto.iterator();
        while (it.hasNext()){
            Set<Multa> poli = (Set<Multa>) it.next();
            for (Multa m : poli){
                contador++;
            }
        }
        return contador;        
    }

//    public static Set<String> policiasConMultas() {
//
//    }
//
//    public static Iterator<Multa> multasPolicia(String codigoPolicia) {
//
//    }

}
