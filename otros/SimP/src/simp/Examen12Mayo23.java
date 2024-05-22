/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simp;

import policias.JefePolicia;
import policias.Multa;
import policias.Policia;
import policias.PoliciaTransito;

/**
 *
 * @author DAW25
 */
public class Examen12Mayo23 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Policia poli= new PoliciaTransito("Paco");
        Policia poli1= new PoliciaTransito("Pepe");
        Policia poli2= new PoliciaTransito("Jose");
        Policia poli3= new JefePolicia("Mariano");
        
        Multa m = new Multa(20);
        Multa m1 = new Multa(23);
        Multa m2 = new Multa(213);
        Multa m3 = new Multa(21);
        Multa m4 = new Multa(23);

        System.out.print(poli3);
        Multa.introducirMulta(poli.getCodigo(),m );
        Multa.introducirMulta(poli1.getCodigo(),m1 );
        Multa.introducirMulta(poli1.getCodigo(),m2);
        Multa.introducirMulta(poli2.getCodigo(),m3 );
        Multa.introducirMulta(poli.getCodigo(),m4 );
        Multa.numeroMultasTotal();
        
    }    
    
    
}
