package Models;

import java.text.DecimalFormat; 

public class Bouteille {

    // Attributs

    private String nom;
    private double prix;
    private double contenance;
    private double remplissage;
    private boolean enVerre;

    // Constructeur

    public Bouteille(String nom, double prix, double contenance, boolean enVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        remplissage = 100.0;
        this.enVerre = enVerre;
    }

    // Méthodes 

    public double prixFormatee(){
        DecimalFormat prixFormate = new DecimalFormat("0.00"); 
        return Double.parseDouble(prixFormate.format(prix));
    }

    // Getters

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double getContenance() {
        return contenance;
    }

    public double getRemplissage() {
        return remplissage;
    }

    public boolean getEnVerre() {
        return enVerre;
    }

    public void setRemplissage(double remplissage) {
        this.remplissage = remplissage;
    }

    // toString

    public String toString() {
        String materiel;
        String videOuPlein;
        if (enVerre == true) {
            materiel = "en verre";
        } else {
            materiel = "en plastique";
        }

        if (remplissage == 100.0) {
            videOuPlein = "pleine";
        } else if (remplissage > 0 && remplissage < 100.0) {
            videOuPlein = "entamée"; 
        } else {
            videOuPlein = "vide";
        }

        String affichage = "Bouteille '" + nom + "' de " + contenance + "L " + materiel + " à " + prixFormatee() + " Frs - " + videOuPlein;
        return affichage;
    }

}
