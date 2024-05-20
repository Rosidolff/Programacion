
package ar12_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;


public class AR12_18 {

    
    public static void main(String[] args) {
        
        Collection<Integer> cole = new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
            cole.add((int) (Math.random() * 100 + 1));            
        }
        System.out.println(cole);
        Integer[] array = cole.toArray(new Integer[0]);
        Arrays.sort(array, Comparator.reverseOrder());
        
        System.out.println(Arrays.toString(array));
        
        List<Integer>cole2 = new ArrayList<>(Arrays.asList(array));
        System.out.println(cole2);
        Collections.sort(cole2, (a,b)-> b-a);
        System.out.println(cole2);
    }
    
}
