/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package embarcaciones;

/**
 *
 * @author DAW25
 */
public abstract class Barco implements Comparable<Barco> {
    protected String codigo;
    protected double longitud;

    public Barco(String codigo, double longitud) {
        this.codigo = codigo;
        this.longitud = longitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public int compareTo(Barco o) {
        return Double.valueOf(longitud).compareTo(Double.valueOf(o.longitud));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": "+codigo+" longitud: "+longitud;
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        if ((obj instanceof Barco) && longitud==((Barco)obj).longitud){
        iguales = true;
    }
        return iguales;
    }
    
    
}
