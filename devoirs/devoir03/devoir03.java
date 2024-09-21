package devoir03;

public class devoir03 {
    public static void main(String[] args) {
        // Déclaration des variables jour, mois, et annee
        int jour = 3;
        int mois = 11;
        int annee= 2524;

        // Déterminer si l'année est bissextile
        boolean bissextile = false;
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            bissextile = true;
        }

        // Déclaration des jours par mois
        int[] joursDansMois = {31, bissextile ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Vérification de la validité du mois
        if (mois < 1 || mois > 12) {
            System.out.println("Mois non valable !");
            return;
        }

        // Vérification de la validité du jour
        if (jour < 1 || jour > joursDansMois[mois - 1]) {
            System.out.println("Jour non valable pour le mois donné !");
            return;
        }

        // Calcul du jour de l'An
        int jourDeLAn = 0;

        // Utilisation de switch pour accumuler les jours précédents le mois actuel
        switch (mois) {
            case 12: jourDeLAn += joursDansMois[10]; // Novembre
            case 11: jourDeLAn += joursDansMois[9];  // Octobre
            case 10: jourDeLAn += joursDansMois[8];  // Septembre
            case 9:  jourDeLAn += joursDansMois[7];  // Août
            case 8:  jourDeLAn += joursDansMois[6];  // Juillet
            case 7:  jourDeLAn += joursDansMois[5];  // Juin
            case 6:  jourDeLAn += joursDansMois[4];  // Mai
            case 5:  jourDeLAn += joursDansMois[3];  // Avril
            case 4:  jourDeLAn += joursDansMois[2];  // Mars
            case 3:  jourDeLAn += joursDansMois[1];  // Février
            case 2:  jourDeLAn += joursDansMois[0];  // Janvier
            case 1:  jourDeLAn += jour;              // Jour actuel du mois
        }

        // Affichage du résultat
        System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + jourDeLAn + " de l'An.");
    }
}
