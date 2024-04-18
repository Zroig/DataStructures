package EX9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerList {

    private static Scanner sc = new Scanner(System.in);
    

    public static List<Integer> readIntegerList() {
        List<Integer> intlist = new ArrayList<>();
        System.out.println("Enter Integers, when finished enter anything else");
        while (sc.hasNextInt()) {
            intlist.add(sc.nextInt());
        }
       
        return intlist;
    }

}
