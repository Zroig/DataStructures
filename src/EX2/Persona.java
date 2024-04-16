package EX2;

public class Persona {

    String nom, cognom, direccio;

    public Persona(String nom, String cognom, String direccio) {
        this.nom = nom;
        this.cognom = cognom;
        this.direccio = direccio;
    }

    public String getNom() {
        return nom+" "+cognom+" - ";
    }

    public String getDireccio() {
        return ", "+direccio;
    }


}
