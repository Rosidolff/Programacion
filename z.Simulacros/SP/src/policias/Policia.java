/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policias;

/**
 *
 * @author JMart
 */
public abstract class Policia implements Comparable<Policia> {
    protected String codigo;
    protected static int icod = 0;
    protected String nombre;
    protected double sueldo;

    public Policia(String nombre) {
        this.codigo = Integer.toString(icod++);
        this.nombre = nombre;
        sueldo = 1750;
    }


    @Override
    public int compareTo(Policia o) {
        return codigo.compareTo(o.codigo);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" "+codigo+" "+nombre+" sueldo: "+sueldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static int getIcod() {
        return icod;
    }

    public static void setIcod(int icod) {
        Policia.icod = icod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
