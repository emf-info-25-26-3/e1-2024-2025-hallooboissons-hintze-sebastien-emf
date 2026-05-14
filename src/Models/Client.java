package Models;

public class Client {

    // Attributs

    private String nom;
    private String prenom;
    private String ville;

    // Constructeur

    public Client(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    // Getters

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }

    // tostring

    public String toString(){
        return "Client " + nom.toUpperCase() + " " + prenom + " - " + ville;
    }
}
