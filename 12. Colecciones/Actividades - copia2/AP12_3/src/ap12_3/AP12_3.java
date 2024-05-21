
package ap12_3;

import java.util.ArrayList;
import java.util.Collection;


public class AP12_3 {

 
    public static void main(String[] args) {
        Collection<Integer> cole = new ArrayList<>();
        
        for (int i=0; i<100; i++){
            cole.add((int)(Math.random()*10+1));
        }
        while(cole.remove(5));
        System.out.println(cole);
    }
    
}
