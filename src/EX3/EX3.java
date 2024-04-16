package EX3;

import java.util.HashMap;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        HashMap<String, Integer> vots = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String entrada;

        while (true) {
            entrada = sc.next();
            if (entrada.equals("END")) {
                break;
            }

            if (vots.containsKey(entrada)) {
                vots.put(entrada, vots.get(entrada)+1);
            } else {
                vots.put(entrada, 1);
            }
        }

        for (String nom: vots.keySet()) {
            String clau = nom.toString();
            int valor = vots.get(nom);
            System.out.println(clau+": "+valor);
        }
    }
}
