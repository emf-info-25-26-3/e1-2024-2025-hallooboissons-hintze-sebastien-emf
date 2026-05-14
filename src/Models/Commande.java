package Models;

public class Commande {

    // Constantes

    public static final int MAX_CAGEOTS = 8;

    // Attributs

    private Client client;
    private Cageot[] commande;

    // Constructeur

    public Commande(Client client) {
        this.client = client;
        commande = new Cageot[MAX_CAGEOTS];
    }

    // Méthodes

    public boolean ajouterCageot(Cageot cageotAAjouter) {
        boolean success = false;
        for (int i = 0; i < commande.length; i++) {
            if (commande[i] == null) {
                commande[i] = cageotAAjouter;
                success = true;
                break;
            }
        }
        return success;
    }

    public boolean supprimerCageot(Cageot cageotASupprimer) {
        boolean success = false;
        for (int i = 0; i < commande.length; i++) {
            if (commande[i] == cageotASupprimer) {
                commande[i] = null;
                success = true;
            }
        }
        return success;
    }

    public void annulerCommande() {
        for (int i = 0; i < commande.length; i++) {
            commande[i] = null;
        }
    }

    public Cageot[] listeCageots() {
        int nombreCageots = 0;
        for (int i = 0; i < commande.length; i++) {
            if (commande[i] != null) {
                nombreCageots++;
            }
        }
        Cageot[] listeCageots = new Cageot[nombreCageots];
        for (int i = 0; i < commande.length; i++) {
            if (commande[i] != null) {
                for (int j = 0; j < listeCageots.length; j++) {
                    if (listeCageots[j] == null) {
                        listeCageots[j] = commande[i];
                        break;
                    }
                }
            }
        }
        return listeCageots;

    }

    public double prixTotal() {
        double prixTotal = 0.0;
        Cageot[] cageots = listeCageots();
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                prixTotal += cageots[i].prixTotal();
            }
        }
        return prixTotal;
    }

    // Getters

    public Client getClient() {
        return client;
    }

}
