/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap12_2;

import java.util.Arrays;

/**
 *
 * @author JMart
 * @param <T>
 */
public class Contenedor<T extends Comparable<T>> implements Pila<T>, Cola<T> {

    private T[] objetos;

    public Contenedor(T[] objetos) {
        this.objetos = objetos;
    }

    public T[] getObjetos() {
        return objetos;
    }

    public void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        for (int i = objetos.length - 2; i >= 0; i--) {
            objetos[i + 1] = objetos[i];
        }
        objetos[0] = nuevo;
    }

    public void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }

    public T extraerDelPrincipio() {
        T extraido;
        if (objetos.length == 0) {
            System.out.println("No hay elementos para extraer");
            extraido = null;
        } else {
            extraido = objetos[0];

            objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
        }
        return extraido;
    }

    public T extraerDelFinal() {
        T extraido;
        if (objetos.length == 0) {
            System.out.println("No hay elementos para extraer");
            extraido = null;
        } else {
            extraido = objetos[objetos.length - 1];

            objetos = Arrays.copyOfRange(objetos, 0, objetos.length - 1);
        }
        return extraido;
    }

    void ordenar() {

        Arrays.sort(objetos);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(objetos);
    }

    @Override
    public void apilar(T nuevo) {
        this.insertarAlFinal(nuevo);
    }

    @Override
    public T desapilar() {
       return this.extraerDelFinal();
    }

    @Override
    public void encolar(T nuevo) {
        this.insertarAlFinal(nuevo);
    }

    @Override
    public T desencolar() {
        return this.extraerDelPrincipio();
    }

}
