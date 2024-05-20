/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar12_2;

import java.util.Arrays;

/**
 *
 * @author JMart
 */
public class Contenedor<T> implements Comparable<T>{

    private T[] tabla;

    public Contenedor(T[] tabla) {
        this.tabla = tabla;
    }

    void insertarAlPrincipio(T nuevo) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length);
        tabla[0] = nuevo;
    }

    void insertarAlFinal(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;

    }

    T extraerDelPrincipio() {
        T sale = null;
        if (tabla.length>0){
         sale = tabla[0];
         tabla = Arrays.copyOfRange(tabla, 1,tabla.length);
        }
        
        return sale;
    }

    T extraerDelFinal() {
        T sale = null;
        if (tabla.length>0){
           sale = tabla[tabla.length-1]; 
           tabla = Arrays.copyOf(tabla, tabla.length-1);
        }
        
        
        return sale;
    }

    void ordenar() {

    }

    @Override
    public String toString() {
        return 
    }

    @Override
    public int compareTo(T o) {
       
    }



}
