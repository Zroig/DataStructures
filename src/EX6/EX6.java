package EX6;

import java.util.HashSet;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        HashSet<Integer> cartero = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int entrada;

        for (int i = 0; i<10; i++) {
            entrada = sc.nextInt();
            if (cartero.contains(entrada)) {
                i--;
                System.out.println("No poden haver-hi numeros repetits");
            } else {
                cartero.add(entrada);
            }
            
        }

        imprimirCartero(cartero);

        while (true) {
            entrada = sc.nextInt();
            if (cartero.contains(entrada)) {
                cartero.remove(entrada);
                imprimirCartero(cartero);
            }
            if (cartero.size()==0){
                System.out.println("BINGOOOOOO!");
                break;
            }
        }

        sc.close();
    }

    public static void imprimirCartero(HashSet<Integer> cartero) {
        
        System.out.println("Cartero: "+cartero+"\n -- --- -- --- -- --- --");
        
    }

}
