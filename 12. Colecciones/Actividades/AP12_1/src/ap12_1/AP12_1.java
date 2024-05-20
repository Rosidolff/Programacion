/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap12_1;

import java.util.Arrays;

/**
 *
 * @author JMart
 */
public class AP12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] array1 = {1, 2, 3, 4, 5, 6};
        Integer[] array2 = {7, 8, 9, 10};
        Integer[] array3 = juntatablas(array1, array2);
        
        
        System.out.println(Arrays.toString(array3));

    }

    static <U> U[] juntatablas (U[] tabla, U[] tabla2) {
        U[] tabla3 = Arrays.copyOf(tabla, tabla.length + tabla2.length);
        System.arraycopy(tabla2, 0, tabla3, tabla.length, tabla2.length);
        return tabla3;
    }

}
