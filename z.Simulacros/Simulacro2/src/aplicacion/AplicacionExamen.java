/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion;

import java.util.Scanner;

/**
 *
 * @author DAW25
 */
public class AplicacionExamen {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
     int opcion;
        System.out.println("""
                            Insertar barco. 
                           2. Eliminar barco.  
                           3. Mostrar número de barcos. 
                           4. Mostrar barcos por orden de inserción en la flota.
                           5. Mostrar barco por longitud de menor a mayor.
                           6. Mostrar los metros de longitud de todos los periscopios de la flota. 
                           7. Recibe la flota un ataque.
                           0. Salir del programa. 
                           """);
        opcion = sc.nextInt();
        switch (opcion){
            
        }
        
    }
    
}
