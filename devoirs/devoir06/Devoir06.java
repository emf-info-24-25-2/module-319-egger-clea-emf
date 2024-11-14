public class devoir06;

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

    public static int rechercheMin(int[] tableau) {
        int min = tableau[0];
        for (int valeur : tableau) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int valeur : tableau) {
            if (valeur > max) {
                max = valeur;
            }
        }
        return max;
    }

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

        System.out.print("Tableau généré : ");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();

        int min = rechercheMin(tableau);
        System.out.println("Valeur minimale dans le tableau : " + min);

        int max = rechercheMax(tableau);
        System.out.println("Valeur maximale dans le tableau : " + max);

        int index = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        if (index != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " se trouve à l'index : " + index);
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'est pas présente dans le tableau.");
        }
    }
}
