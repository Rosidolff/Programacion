/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar11_8;

import java.io.Serializable;

/**
 *
 * @author DAW25
 */
public class Socio implements Serializable {
    
    private String nombre;

    public Socio(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " "+nombre+" ";
    }
    
    
}
