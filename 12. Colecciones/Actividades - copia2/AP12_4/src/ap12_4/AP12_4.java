package ap12_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AP12_4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int entrada;
        List<Integer> pos = new ArrayList<Integer>();
        List<Integer> neg = new ArrayList<Integer>();
        System.out.println("Sigiente:");
        entrada = sc.nextInt();
        while (entrada != 0) {
            if (entrada > 0) {
                pos.add(entrada);
            } else {
                neg.add(entrada);
            }
            entrada = sc.nextInt();
        }
        Iterator<Integer> it = pos.iterator();
        while(it.hasNext()){
            if (it.next()>10){
                it.remove();
                
            }
        }
        for (Integer elem : neg){ //peta porque usa un iterador interno. asi que mierda pa mi
            if (elem<-10){
                neg.remove(elem);
            }
        }
    }

}
