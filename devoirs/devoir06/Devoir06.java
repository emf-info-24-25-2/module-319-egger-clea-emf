import java.util.Random;

<<<<<<< HEAD
public class Devoir06;

    // Définition des constantes
    private static final int TAILLE_TABLEAU = 20;
    private static final int VALEUR_MIN = 0;
    private static final int VALEUR_MAX = 50;
    private static final int VALEUR_RECHERCHEE = 7;

    // Méthode pour générer un tableau avec des valeurs aléatoires
    public static int[] genereTableau(int min, int max, int taille) {
        int[] tableau = new int[taille];
        Random random = new Random();
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt((max - min) + 1) + min;
        }
        return tableau;
    }

    // Méthode pour trouver la valeur minimale dans un tableau
=======
    private static final int TAILLE_TABLEAU = 20;
    private static final int VALEUR_MIN = 0;
    private static final int VALEUR_MAX = 50;
    private static final int VALEUR_RECHERCHEE = 7;

    public static int[] genereTableau(int min, int max, int taille) {
        int[] tableau = new int[taille];
        Random random = new Random();
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt((max - min) + 1) + min;
        }
        return tableau;
    }

>>>>>>> 776228c5c2e1cc6bf8926533836e3eee9e22702f
    public static int rechercheMin(int[] tableau) {
        int min = tableau[0];
        for (int valeur : tableau) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

<<<<<<< HEAD
    // Méthode pour trouver la valeur maximale dans un tableau
=======
>>>>>>> 776228c5c2e1cc6bf8926533836e3eee9e22702f
    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int valeur : tableau) {
            if (valeur > max) {
                max = valeur;
            }
        }
        return max;
    }

<<<<<<< HEAD
    // Méthode pour rechercher une valeur spécifique dans un tableau
    public static int rechercheValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i; // retourne l'index si la valeur est trouvée
            }
        }
        return -1; // retourne -1 si la valeur n'est pas trouvée
    }

    // Méthode principale
    public static void main(String[] args) {
        // Génération du tableau avec les constantes définies
        int[] tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);

        // Affichage du contenu du tableau
=======
    public static int rechercheValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);

>>>>>>> 776228c5c2e1cc6bf8926533836e3eee9e22702f
        System.out.print("Tableau généré : ");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();

<<<<<<< HEAD
        // Recherche et affichage du minimum
        int min = rechercheMin(tableau);
        System.out.println("Valeur minimale dans le tableau : " + min);

        // Recherche et affichage du maximum
        int max = rechercheMax(tableau);
        System.out.println("Valeur maximale dans le tableau : " + max);

        // Recherche et affichage de l'index de VALEUR_RECHERCHEE
=======
        int min = rechercheMin(tableau);
        System.out.println("Valeur minimale dans le tableau : " + min);

        int max = rechercheMax(tableau);
        System.out.println("Valeur maximale dans le tableau : " + max);

>>>>>>> 776228c5c2e1cc6bf8926533836e3eee9e22702f
        int index = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        if (index != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " se trouve à l'index : " + index);
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'est pas présente dans le tableau.");
        }
    }
<<<<<<< HEAD

=======
}
>>>>>>> 776228c5c2e1cc6bf8926533836e3eee9e22702f
