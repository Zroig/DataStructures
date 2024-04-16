package EX2;

public class Persona {

    String nom, cognom, direccio, dni;

    public Persona(String nom, String cognom, String direccio, String dni) {
        this.nom = nom;
        this.cognom = cognom;
        this.direccio = direccio;
        this.dni = dni;
    }

    public String getPersona() {
        return nom+" "+cognom+" - "+dni+", "+direccio;
    }


}
