
package ar11_4;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author DAW25
 */
public class AR11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int numeros [] =new int[10];
        try (ObjectInputStream in = new ObjectInputStream (new FileInputStream("datos.dat"))){
            
                        
            for (int i=0; i<10; i++ ){
                 numeros[i] = in.readInt();
             }
             System.out.println(Arrays.toString(numeros));
                    
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
    
}
