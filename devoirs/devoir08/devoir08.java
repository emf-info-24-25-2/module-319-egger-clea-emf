package devoir08;
import java.util.Random;
public class devoir08 {
    

    // Constantes
    private static final String[] CARACTERES = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    private static final int NBR_ESSAI = 5;
    private static final int TAILLE_MOT_DE_PASSE = 15;

    public static void main(String[] args) {
        // Boucle pour générer NBR_ESSAI mots de passe
        for (int i = 0; i < NBR_ESSAI; i++) {
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE);
            System.out.println(motDePasse);
        }
    }

    // Méthode pour générer un mot de passe
    private static String genereMotDePasse(int taille) {
        StringBuilder resultat = new StringBuilder();
        Random random = new Random();

        while (resultat.length() < taille) {
            // Choisir une position aléatoire dans le tableau CARACTERES
            int position = random.nextInt(CARACTERES.length);
            resultat.append(CARACTERES[position]);
        }

        return resultat.toString();
    }
}


