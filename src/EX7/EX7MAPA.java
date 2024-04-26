package EX7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EX7MAPA {
    public static void main(String[] args) {
        HashMap<Integer, String> pacients = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        String nom = "";
        int tipus;
        int prioritat;

        while (true) {
            tipus = sc.nextInt();

            if (tipus == -1) {

                break;

            } else if (tipus == 1) {

                prioritat = sc.nextInt();
                nom = sc.next();
                pacients.put(prioritat, nom);

            } else if (tipus == 0) {

                if (pacients.size()!=0) {

                    int clau = Collections.max(pacients.keySet());
                    System.out.println(pacients.get(clau));
                    pacients.remove(clau);

                } else {

                    System.out.println("No hi ha pacients");
                }
                
            }
        }

        sc.close();
    }

}
