package ada12_15;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AdA12_15 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(3);
        lista.add(3);

        List<Integer> listaSinRepes = eliminarRepes(lista);
        System.out.println(listaSinRepes);
    }

    public static <U> List<U> eliminarRepes(List<U> lista) {
        Set<U> sinrepes = new LinkedHashSet<>(lista);
        return new ArrayList<>(sinrepes);
    }

}
