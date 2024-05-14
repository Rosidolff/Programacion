/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada12_25;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author JMart
 */
public class Socio implements Comparable<Socio>, Serializable {

    private String dni;
    private String nombre;
    private LocalDate fA;
    private int ant;

    public Socio(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fA = LocalDate.parse(fechaNacimiento, formatter);
        ant = Period.between(fA, LocalDate.now()).getYears();
    }

    public Socio(String dni) {
        this.dni = dni;
    }

    public int antiguedad() {
        return ant;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " Nombre: " + nombre + " Antigüedad: " + ant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFnac() {
        return fA;
    }

    public void setFnac(LocalDate fnac) {
        this.fA = fnac;
    }

    @Override
    public int compareTo(Socio o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Socio)obj).dni.equals(dni);
    }

}
