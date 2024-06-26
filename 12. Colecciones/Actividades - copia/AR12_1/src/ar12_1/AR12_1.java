package ar12_1;

import java.util.Arrays;

public class AR12_1 {

    public static void main(String[] args) {
        String cadenas[] = new String[0];
        System.out.println(Arrays.toString(cadenas));
        cadenas = guardar("coche", cadenas);
        cadenas = guardar("avion", cadenas);
        System.out.println(Arrays.toString(cadenas));
    }

    static <E> E[] guardar(E elemen, E[] tabla) {
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length-1] = elemen;
        return nuevaTabla;
    }
}
