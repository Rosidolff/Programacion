/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policias;

/**
 *
 * @author DAW25
 */
public abstract class Policia implements Comparable<Policia> {
    protected String codigo="";
    protected String nombre;
    protected double sueldo;

    public Policia(String nombre) {
        for(int i =0; i<3;i++){
        codigo+=Integer.toString((int) (Math.random()*10));  
        }        
        this.nombre = nombre;
        sueldo = 1750;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return "Codigo: "+codigo+" Nombre: "+nombre+" Sueldo: "+sueldo+"\n";
    }

    @Override
    public int compareTo(Policia o) {
      return codigo.compareTo(o.codigo);
    }
    
    
}
