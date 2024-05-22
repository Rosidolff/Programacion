/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import policias.Multa;
import policias.Policia;
import policias.PoliciaTransito;

/**
 *
 * @author JMart
 */
public class ComisariaPolicia {

    private List<Policia> lista = new ArrayList<>();

    public ComisariaPolicia() {
    }

    public boolean insertarPolicia(Policia p) {
        boolean existe = false;
        if (lista.contains(p)){
            existe = true;
        } else{
            lista.add(p);
        }
        return existe;
    }

    public boolean eliminarPolicia(Policia p) {
        return lista.remove(p);
    }

    public boolean insertarMultaPolicia(String codigo, Multa m) {
       Policia p;
       Boolean sepuede = false;
      Iterator<Policia> it = lista.iterator();
      while (it.hasNext()){
          p = it.next();
          if (p.getCodigo().equals(codigo)&& p instanceof PoliciaTransito){
              Multa.introducirMulta(codigo, m);
              sepuede = true;
          }
      }
        return sepuede;        
    }
    

    public Policia encontrarPorCodigo(String codigo) {

    }

    public String toStringPoliciasYMultasOrdenadoPorCodigo() {

    }

    public String toStringPoliciasOrdenadoPorNombre() {

    }

}
