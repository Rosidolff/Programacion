/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap12_5;

/**
 *
 * @author JMart
 */
public class Clientes implements Comparable {

    private int dni;
    private String nombre;
    private int edad;

    public Clientes(int dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        return dni - ((Clientes) o).dni;

    }

    @Override
    public String toString() {
        return "Nombre "+nombre+" DNI "+dni+" Edad "+edad +"\n";
    }

}
