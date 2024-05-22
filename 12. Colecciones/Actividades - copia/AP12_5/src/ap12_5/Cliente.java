/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap12_5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author JMart
 */
public class Cliente implements Comparable {

    private String dni;
    private String nombre;
    private LocalDate fnac;
    private int edad;

    public Cliente(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fnac = LocalDate.parse(fechaNacimiento, formatter);
        edad = Period.between(fnac, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "DNI: "+dni+" Nombre: "+nombre+" Edad: "+edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFnac() {
        return fnac;
    }

    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }

    @Override
    public int compareTo(Object o) {
                return dni.compareTo(((Cliente)o).dni);
    }
    

}
