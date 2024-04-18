package EX10;

import java.util.HashMap;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        HashMap<String, Integer> paraules = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String entrada;
        int cont = 0;
        while (true) {
            entrada = sc.next();

            if (entrada.equals("END")) {
                break;
            }

            if (!paraules.containsKey(entrada)) {
                paraules.put(entrada, 1);
            } else {
                paraules.put(entrada, paraules.get(entrada)+1);
            }
        }

        for (@SuppressWarnings("unused") String claus : paraules.keySet()) {
            cont++;
        }

        

        System.out.println(cont+" Paraules");

        sc.close();

    }

}
