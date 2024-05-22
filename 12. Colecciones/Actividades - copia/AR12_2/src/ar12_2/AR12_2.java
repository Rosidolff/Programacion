/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar12_2;

/**
 *
 * @author JMart
 */
public class AR12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Contenedor<Integer> conte = new Contenedor<>(new Integer[0]);
        for (int i = 0; i < 10; i++) {
            conte.insertarAlFinal((int) (Math.random() * 20));
        }
        for (int i = 0; i < 10; i++) {
            conte.insertarAlPrincipio(i);
        }
        System.out.println(conte);
        conte.ordenar();
        System.out.println(conte);
    }

}
