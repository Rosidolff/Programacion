package ar12_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AR12_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero; 
        int entrada = 0;

        System.out.println("Introduca una serie de numeros enteros no negativos:");
        System.out.println("Numero: ");
        entrada = sc.nextInt();
        while (entrada >= 0) {
            numeros.add(entrada);
            System.out.println("Numero: ");
            entrada = sc.nextInt();
        }
        System.out.println("Coleccion: "+ numeros);
        for(Integer num : numeros){
            if (num%2==0){
                System.out.print(num +", ");
            }
        }
        System.out.println("");
        Iterator<Integer> it = numeros.iterator();
        
        while (it.hasNext()){
            numero = it.next();
            if (numero%3==0){
                it.remove();
            }
        }
        System.out.println("Array sin multiplos de 3: "+ numeros);
    }

}
