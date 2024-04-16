package EX2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        HashMap<String, Persona> persones = new HashMap<>();
        int c = sc.nextInt();
        
        String dni, nom, cognom;
        System.out.println("To add a person input following this pattern:\n DNI\n Name\n Surname\n Direction /\n End the direction with /");
        for (int i = 0; i < c; i++) {
            dni = sc.next();
            nom = sc.next();
            cognom = sc.next();
            Persona persona = new Persona(nom, cognom, llegirDireccio(sc), dni);
            persones.put(dni, persona);
            System.out.println("Added person");
        }

        while (true) {
            String e = sc.next();
            if (e.equals("END")) {
                break;
            }

            if (persones.containsKey(e)) {
                System.out.println(persones.get(e).getPersona());
            } else {
                System.out.println("DNI no valid");
            }
        }
        sc.close();
    }

    public static String llegirDireccio(Scanner sc) {
        ArrayList<String> direccioParts = new ArrayList<>();
        String direccio = "";
        String aux = "";
        while (true) {
            aux = sc.next();
            if (aux.equals("/")) {
                break;
            }
            direccioParts.add(aux);
            
        }

        for (int i = 0; i<direccioParts.size(); i++) {
            direccio = direccio+direccioParts.get(i)+" ";
        }
        return direccio;

    }

}
