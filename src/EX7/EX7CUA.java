package EX7;

import java.util.PriorityQueue;
import java.util.Scanner;

public class EX7PQ {
    public static void main(String[] args) {
        PriorityQueue<Pacients> cua = new PriorityQueue<>((a, b) -> Integer.compare(b.getPrioritat(), a.getPrioritat()));
        Scanner sc = new Scanner(System.in);

        while (true) {
            int tipus = sc.nextInt();
            if (tipus == -1) {
                break;
            }

            switch (tipus) {
                case 1:
                    int prioritat = sc.nextInt();
                    String nom = sc.next();
                    Pacients pacient = new Pacients(prioritat, nom);
                    cua.add(pacient);
                    break;
                case 0:
                    if (cua.size()>0) {
                        System.out.println(cua.poll().getNom());
                    } else {
                        System.out.println("No hi ha pacients");
                    }
                    break;
            }
        }
        sc.close();
    }
}

class Pacients {
    int prioritat;
    String nom;
    public Pacients(int prioritat, String nom) {
        this.prioritat = prioritat;
        this.nom = nom;
    }

    public int getPrioritat() {
        return prioritat;
    }

    public String getNom() {
        return nom;
    }
}
