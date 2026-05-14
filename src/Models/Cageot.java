package Models;

public class Cageot {

    // Constantes
    public static final int NOMBRE_BOUTEILLES = 12;

    // Attributs
    private String identifiant;
    private Bouteille[] cageot;

    // Constructeur
    public Cageot(String identifiant) {
        this.identifiant = identifiant;
        cageot = new Bouteille[NOMBRE_BOUTEILLES];
    }

    // Méthodes
    public boolean rangerBouteille(Bouteille nouvelleBouteille) {
        boolean success = false;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] == null) {
                cageot[i] = nouvelleBouteille;
                success = true;
                break;
            }
        }
        return success;
    }

    public boolean prendreBouteille(Bouteille bouteilleAPrendre) {
        boolean success = false;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] == bouteilleAPrendre) {
                cageot[i] = null;
                success = true;
            }
        }
        return success;
    }

    public int nombreBouteilles() {
        int nombreBouteilles = 0;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] != null) {
                nombreBouteilles++;
            }
        }
        return nombreBouteilles;
    }

    public Bouteille[] listeBouteilles() {
        Bouteille[] listeBouteilles = new Bouteille[nombreBouteilles()];
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] != null) {
                for (int j = 0; j < listeBouteilles.length; j++) {
                    if (listeBouteilles[j] == null)
                        listeBouteilles[j] = cageot[i];
                }
            }
        }
        return listeBouteilles;
    }

    public double prixTotal() {
        double prixTotal = 0.0;
        for (int i = 0; i < cageot.length; i++) {
            if (cageot[i] != null) {
                prixTotal += cageot[i].getPrix();
            }
        }
        return prixTotal;
    }

    // Getters
    public String getIdentifiant() {
        return identifiant;
    }

    // toString
    public String toString() {
        String affichage = "Cageot " + identifiant + " avec " + nombreBouteilles() + "/" + cageot.length
                + " bouteilles";
        return affichage;
    }

}