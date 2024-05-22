/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada12_37;

/**
 *
 * @author DAW25
 */
public class Jugador {
    
    private int dni;
    private String nombre;
    private Posicion posicion;
    private double estatura;

    public Jugador(int Dni, String nombre, String posicion, double estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = Posicion.valueOf(posicion.toUpperCase()); 
        this.estatura = estatura;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Jugador: "+nombre+"( dni: "+dni+") Posición: "+posicion+" Estatura: "+estatura;
    
    }
}