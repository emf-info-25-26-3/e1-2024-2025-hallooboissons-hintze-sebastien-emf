package app;

public class Cageot {

    // Constantes
    public static final int NOMBRE_BOUTEILLES = 12;

    // Attributs
    private String identifiant;
    private Bouteille[] cageot = new Bouteille[NOMBRE_BOUTEILLES];

    // Constructeur
    public Cageot(String identifiant){
        this.identifiant = identifiant;
        cageot = null; 
    }

    // Méthodes
    public boolean rangerBouteille(){
        int position = 0;
        if (position <11) {
            
        }
    }

    // Getters
    public String getIdentifiant() {
        return identifiant;
    }



}