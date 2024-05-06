
package ap10_4;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class AP10_4 {


    public static void main(String[] args) {
        double suma=0, media;
        int contador=0;
        try (BufferedWriter out = new BufferedWriter (new FileWriter("NumerosReales.txt"))){
            out.write("1 235 3 123.5 35.5 -15");
        } catch (IOException ex){
            System.out.println(ex);
        }
        try (BufferedReader in = new BufferedReader (new FileReader("NumerosREales.txt"))){
           Scanner sc = new Scanner (in.readLine());
           while (sc.hasNext()){
               suma+=sc.useLocale(Locale.US).nextDouble();
               contador++;
           }
        } catch (IOException ex){
            System.out.println(ex);
        }
        media = suma/contador;
        System.out.println("LA media es:" +media+" y la suma es: "+suma);
    }
    
}
