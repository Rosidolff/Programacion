/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simucreacion;

/**
 *
 * @author DAW25
 */
public class Simucreacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//EQUALS//
 @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        if (obj != null && obj instanceof NotaAlumnado && this.fecha.equals(((NotaAlumnado) obj).fecha)) {
            iguales = true;
        }
        return iguales;
    }
//////////////////
public boolean recibirAtauqe() {
        Double min = Double.MAX_VALUE;
        Barco barcoMinimo = null;

        for (Barco barco : conjuntoFlota) {
            if (barco.getLongitud() < min) {
                min = barco.getLongitud();
                barcoMinimo = barco;
            }
        }

        return conjuntoFlota.remove(barcoMinimo);
    }
//////////////////////
    }
    
}
