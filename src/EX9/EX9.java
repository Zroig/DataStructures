package EX9;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class EX9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list = IntegerList.readIntegerList();

        Iterator<Integer> iterador = list.iterator();

        while (iterador.hasNext()) {
            Integer num = iterador.next();

            if (num % 2 == 0) {
                iterador.remove();
            }
        }
        
        System.out.println(list);
        
    }

}
