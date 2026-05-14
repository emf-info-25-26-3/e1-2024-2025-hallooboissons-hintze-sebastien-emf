package app;

import Models.Bouteille;
import Models.Cageot;
import Models.Client;
import Models.Commande;

public class Application {

    public static void main(String[] args) {

        Client client1 = new Client("Jean", "Ducobu", "Bulle");
        Client client2 = new Client("Mac", "Haroni", "Fribourg");

        Bouteille b1 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille b2 = new Bouteille("Henniez verte", 2.6, 1, true);
        Bouteille b3 = new Bouteille("Coca Cola", 3.85, 1.5, false);
        Bouteille b4 = new Bouteille("Pepsi", 3.55, 1.5, false);
        Bouteille b5 = new Bouteille("Sinalco", 4.25, 1.5, false);


        Cageot cageot1 = new Cageot("X83H4");
        Cageot cageot2 = new Cageot("X83H5");
        Cageot cageot3 = new Cageot("X83H6");
        Cageot cageot4 = new Cageot("X83H7");

        for (int i = 0; i < 6; i++) {
            cageot1.rangerBouteille(b1);
            cageot1.rangerBouteille(b2);
        }

        for (int i = 0; i < 2; i++) {
            cageot2.rangerBouteille(b3);
            cageot4.rangerBouteille(b3);
        }

        cageot3.rangerBouteille(b4);
        cageot3.rangerBouteille(b5);

        cageot4.rangerBouteille(b1);


        Commande[] tableauCommandes = new Commande[10];
        Commande commande1 = new Commande(client1);
        Commande commande2 = new Commande(client2);

        commande1.ajouterCageot(cageot1);
        commande1.ajouterCageot(cageot2);
        commande1.ajouterCageot(cageot3);

        commande2.ajouterCageot(cageot4);

        afficherCommande(commande1);
        afficherCommande(commande2);

    }

    public static void afficherCommande(Commande commande) {
        if (commande != null) {
            System.out.println("----------------------");
            System.out.println("Commande pour le client : " + commande.getClient());
            Cageot[] cageotsALivrer = commande.listeCageots();
            System.out.println("La commande contient " + cageotsALivrer.length + " cageots");
            System.out.println("Le prix total de la commande est de " + commande.prixTotal() + " Frs");
        }

    }
}
