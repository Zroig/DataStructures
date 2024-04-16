package EX5;

import java.util.HashSet;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        HashSet<String> paraules = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        String entrada;

        while (true) {
            entrada = sc.next();

            if (entrada.equals("END")) {
                break;
            }

            if (paraules.contains(entrada)) {
                System.out.println("MEEEEEEEEEEEC!");
            } else {
                paraules.add(entrada);
            }
        }

        sc.close();
    }
    

}
