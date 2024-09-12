package devoir01;

public class devoir01 {
    public static void main(String[] args) {
        byte monAge = 21;
        boolean estMajeur;
        if (monAge < 20) {
            estMajeur = false;
        } else {
            estMajeur = true;
        }

        System.out.println("je m'appelle Egger Cléa");
        System.out.println("Mon âge est de " + monAge + " ans");

        if (estMajeur == true) {
            System.out.println("Je suis majeur");
        } else if (estMajeur == false) {
            System.out.println("Je ne suis pas encore majeur");
        }
    }
}
