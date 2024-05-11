
package ap12_1;

import java.util.Arrays;


public class AP12_1 {


    public static void main(String[] args) {
        Integer [] array1 = {1, 2, 3, 4, 5, 6};
        Integer [] array2 = {7, 8, 9, 10};
        Integer [] array3 = juntar(array1, array2);
        System.out.println(Arrays.toString(array3));
    }
    static <E> E[] juntar (E[] t1, E[] t2 ){
        E[] t3 = Arrays.copyOf(t1, t1.length+t2.length);
        System.arraycopy(t2, 0, t3, t1.length, t2.length);
        
        return t3;
    } 
    
}
