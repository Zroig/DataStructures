package EX4;

import java.util.HashMap;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        
        HashMap<String, Cotxe> cotxes = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        String entrada, matricula, model, color;
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            matricula = sc.next();
            model = sc.next();
            color = sc.next();
            Cotxe cotxe = new Cotxe(model, color);
            cotxes.put(matricula, cotxe);
        }

        while (true) {
            entrada = sc.next();
            
            if (entrada.equals("END")) {

                break;

            }

            if (cotxes.containsKey(entrada)) {

                System.out.println(entrada+" "+cotxes.get(entrada).getInfo());

            } else {
                System.out.println("Cotxe no existent");
            }

        }

        sc.close();
    }

}
