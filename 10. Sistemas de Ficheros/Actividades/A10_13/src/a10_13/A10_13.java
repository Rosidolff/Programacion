/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a10_13;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class A10_13 {

    public static void main(String[] args) {
        int[] lista1 = importaArray("lista1.txt");
        int[] lista2 = importaArray("lista2.txt");
        int[] listaC = unir(lista1, lista2);
        
     
        Arrays.sort(listaC);
        System.out.println(Arrays.toString(listaC));

        try (BufferedWriter out = new BufferedWriter(new FileWriter("listaC.txt"))){
           for (int num : listaC){
               out.write(String.valueOf(num));
               out.newLine();
           }
            
        }catch (IOException ex){
            System.out.println(ex);
        }
        
        
        
    }

    public static int[] unir(int[] lista1, int[] lista2) {
        int[] listaC = new int [lista1.length+lista2.length];
        for (int i=0; i<lista1.length;i++){
            listaC[i]= lista1[i];
        }
        for (int i=0; i<lista2.length;i++){
            listaC[lista1.length+i]= lista2[i];
        }
        return listaC;
    }

    public static int[] importaArray(String fichero) {
        int[] array = new int[0];
        try (BufferedReader in = new BufferedReader(new FileReader(fichero))) {
            String linea = in.readLine();

            while (linea != null) {
                Scanner sc = new Scanner(linea);
                while (sc.hasNextInt()) {
                    array = Arrays.copyOf(array, array.length + 1);
                    array[array.length - 1] = sc.nextInt();
                    linea = in.readLine();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return array;
    }

}
