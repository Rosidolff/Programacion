
package ap10_2;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class AP10_2 {

   
    public static void main(String[] args) {
        String nombre;
        int edad;
        double estatura;
        Scanner sc = new Scanner(System.in);
        Scanner sout;
        nombre = sc.nextLine();
        edad = sc.nextInt();
        String linea, texto;
        estatura = sc.useLocale(Locale.US).nextDouble();
        
        try (BufferedWriter out = new BufferedWriter (new FileWriter("deportistas.txt")) ){
            out.write(nombre+" "+edad+" "+estatura);
            out.newLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        try (BufferedReader in = new BufferedReader (new FileReader("deportistas.txt"))){
            linea = in.readLine();
            while (linea!=null){
                sout = new Scanner(linea);
                texto = sout.nextLine();
                System.out.println(texto);
                linea = in.readLine();
            }
            
        } catch (IOException ex){
            System.out.println(ex);
        }

       
        
        
    }
    
}
