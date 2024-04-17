package EX8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Queue<String> cua = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        int tipus;
        while (true) {
            tipus = sc.nextInt();

            if (tipus == -1) {

                break;

            } else if (tipus == 1) {

                sc.nextInt();
                cua.add(sc.next());

            } else if (tipus == 0) {

                if (cua.peek()!=null) {

                    System.out.println(cua.poll());

                } else {

                    System.out.println("No hi ha pacients");

                }

            }
        }

        sc.close();
    }

}
