package EX1;

import java.util.HashMap;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        /*
         *  Exercici 1: Crearem el HashMap cartells per emmagatzemar el metre com a clau i el nom del cartell com a valor
         *  seguidament utilitzant la variable c, iterarem c cops per emmagatzemar les dades a cartells, llavors amb les
         *  variables metre i cartell llegirem el int i el String de l'entrada. Després amb un while true iterarem fins que
         *  l'usuari introdueixi -1 i així farem un break al while. Seguidament comprovarem si la clau existeix segons l'entrada
         *  de l'usuari, en cas que si la imprimirem, en cas que no imprimirem el missatge d'error.
         * 
         */
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
