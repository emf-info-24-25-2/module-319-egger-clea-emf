package revisions.E2_2022_2023;



public class entrainement {

    //Créez les constantes
    public static final int PRIX_CATEGORIE_UN = 25;
    public static final int PRIX_CATEGORIE_DEUX = 18;
    public static final int PRIX_CATEGORIE_TROIS = 12;

    //Créez le tableau constant
    public static final int[] CATEGORIE_SALLE ={3, 3, 2, 2, 1, 1, 2, 2, 3, 3};

    public static void main(String[] args) {
        boolean[] monTableau = new boolean[CATEGORIE_SALLE.length];
        afficherSalle(monTableau);
        afficherTarifs();
        
    }

    //Créez une méthode nommée afficherTarifs. Cette méthode sera uniquement responsable d’afficher les différents tarifs
    public static void afficherTarifs() {

        System.out.println(PRIX_CATEGORIE_UN);
        System.out.println(PRIX_CATEGORIE_DEUX);
        System.out.println(PRIX_CATEGORIE_TROIS);
 
    }

    //Créez une méthode nommée afficherSalle
    public static void afficherSalle(boolean[] tab) {

        System.out.println("Occupations de la salle");

        //Boucle pour afficher le numéro des catégories contenu dans la constante CATEGORIE_SALLE
        for (int i=0; i<CATEGORIE_SALLE.length; i++){
            System.out.print(CATEGORIE_SALLE[i]);
        }


        //Boucle pour afficher le fait qu’une place soit occupée ou non. La méthode affichera un X pour les places libres et un O pour les places occupées
        System.out.println();
    }
    

}
