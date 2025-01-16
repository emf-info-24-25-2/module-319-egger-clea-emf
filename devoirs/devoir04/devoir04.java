package devoir04;

public class devoir04 {
    public static void main(String[] args) {
        // Déclaration des variables year, month, day avec des valeurs fixes
        int year = 2014;
        int month = 9;
        int day = 12;

        // Validation des limites et affichage des résultats
        if (year < 0 || year > 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");
        } else if (month < 1 || month > 12) {
            System.out.println("Le mois [" + month + "] est hors limites !");
        } else if (!isValidDay(year, month, day)) {
            System.out.println("Le jour [" + day + "] est hors limites !");
        } else {
            System.out.println("La date entrée est le " + day + "." + month + "." + year);
            System.out.println("La date formatée est le " + formatDay(day) + " " + getMonthName(month) + " " + year);
        }
    }

    // Méthode pour valider le jour
    private static boolean isValidDay(int year, int month, int day) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Vérification des années bissextiles
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return day >= 1 && day <= daysInMonth[month - 1];
    }

    // Méthode pour vérifier si une année est bissextile
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Méthode pour obtenir le nom du mois
    private static String getMonthName(int month) {
        switch (month) {
            case 1: return "janvier";
            case 2: return "février";
            case 3: return "mars";
            case 4: return "avril";
            case 5: return "mai";
            case 6: return "juin";
            case 7: return "juillet";
            case 8: return "août";
            case 9: return "septembre";
            case 10: return "octobre";
            case 11: return "novembre";
            case 12: return "décembre";
            default: return "";
        }
    }

    private static String formatDay(int day) {
        return String.valueOf(day);
    }
}
