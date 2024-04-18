package EX1;

import java.util.HashMap;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        HashMap<Integer, String> cartells = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String cartell = "";
        int metre = 0;
        int c = 0;
        c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            metre = sc.nextInt();
            cartell = sc.next();
            cartells.put(metre, cartell);
        }

        while (true) {
            
            c = sc.nextInt();
            
            if (c == -1) {
                 break; 
            }

            if (cartells.containsKey(c)) {
                System.out.println(cartells.get(c));
            } else {
                System.out.println("No hi ha cartell");
            }
        }

        sc.close();

    }

}
