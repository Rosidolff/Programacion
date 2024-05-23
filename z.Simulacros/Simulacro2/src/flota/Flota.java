/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota;

import embarcaciones.Barco;
import embarcaciones.Submarino;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DAW25
 */
public class Flota {

    int max;
    Set<Barco> flota = new LinkedHashSet<>();

    public Flota(int maximo) {
        max = maximo;
    }

    public int numeroBarcos() {
        return flota.size();
    }
//→ devuelve el número de barcos que tiene la flota en ese momento. 

    public boolean insertarBarco(Barco b) {
        boolean insertado = false;
        if (flota.size() < max) {
            insertado = flota.add(b);
        }
        return insertado;
    }
//→ inserta el Barco b en la flota. Devuelve true si lo ha 
    //insertado, false en caso contrario. 

    public boolean eliminarBarco(Barco b) {
        return flota.remove(b);
    }
//→ elimina el Barco b de la flota. Devuelve true si lo ha 
    //eliminado, false en caso contrario. 

    public int longitudPeriscopioFlota() {
        int lp = 0;
        for (Barco velero : flota) {
            if (velero instanceof Submarino sub) {
                lp += sub.getPeriscopio();
            }
        }
        return lp;
    }
//→ devuelve la longitud total de los periscopios de la flota. 

    public boolean recibeAtaque(){
          
        
       Set<Barco> porLongitud = new TreeSet<>(flota);
       Barco b;
       Iterator<Barco> it = porLongitud.iterator();
       b= it.next();
       return flota.remove(b);
    }
            
//→ elimina el menor de los barcos de la flota. Devuelve true si se 
    //elimina y false, en caso contrario. 


    public ArrayList<Barco> listadoBarcos() {
    ArrayList<Barco> lista = new ArrayList<>(flota);
    
    return lista;
    }


//→ devuelve un ArrayList de todos los barcos que está en 
    //la flota, en la actualidad.

}
