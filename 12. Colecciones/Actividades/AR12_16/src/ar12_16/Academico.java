/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar12_16;

/**
 *
 * @author JMart
 */
public class Academico implements Comparable<Academico>{
    private String nombre;
    private int ingreso;

    public Academico(String nombre, int ingreso) {
        this.nombre = nombre;
        this.ingreso = ingreso;
    }

    @Override
    public int compareTo(Academico o) {
        return nombre.compareTo(o.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return nombre+" "+ingreso;
    }
    
}
