package devoir05;

import java.util.Scanner;

public class devoir05 {

    public static void main(String[] args) {
        // Étape 1 : Générer un nombre aléatoire entre 1 et 100
        int limiteInfComprise = 1;
        int limiteSupComprise = 100;
        int nombreADeviner = (int) (Math.random() * (limiteSupComprise - limiteInfComprise + 1)) + limiteInfComprise;

        // Étape 2 : Initialisation pour récupérer les devinettes de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        int tentative;
        boolean trouve = false; // Pour suivre si le nombre a été trouvé

        // Étape 3 : Commencer la boucle de devinette
        System.out.println("Bienvenue au jeu de devinette !");
        System.out.println("Essayez de deviner le nombre entre " + limiteInfComprise + " et " + limiteSupComprise);

        while (!trouve) {
            System.out.print("Entrez votre devinette : ");
            tentative = scanner.nextInt();

            // Étape 4 : Vérifier la devinette
            if (tentative < nombreADeviner) {
                System.out.println("Trop petit ! Essayez encore.");
            } else if (tentative > nombreADeviner) {
                System.out.println("Trop grand ! Essayez encore.");
            } else {
                System.out.println("Bravo, trouvé ! Le nombre était " + nombreADeviner);
                trouve = true; // Le joueur a trouvé le nombre, on sort de la boucle
            }
        }

        // Étape 5 : Fin du programme
        System.out.println("Merci d'avoir joué !");
        scanner.close();
    }
}


