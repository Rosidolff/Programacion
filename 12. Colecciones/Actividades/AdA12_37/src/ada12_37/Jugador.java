/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada12_37;

/**
 *
 * @author JMart
 */

public class Jugador implements Comparable<Jugador>{


    public enum Posicion {DEFENSA,CENTROCAMPISTA,DELANTERO,PORTERO};
    private String dni;
    private String nombre;
    private double altura;
    private Posicion posicion;

    public Jugador(String dni, String nombre, double altura, String posicion) {
        this.dni = dni;
        this.nombre = nombre;
        this.altura = altura;
        this.posicion = Posicion.valueOf(posicion.toUpperCase());
    }
    
        @Override
    public int compareTo(Jugador o) {
       return dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return dni+" "+nombre+" "+posicion+" "+altura;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public String getDni() {
        return dni;
    }
    
}
