package exercices.exercice06;

public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int age=10;

        if (age == 7) {
            System.out.println("Poussin");
        }
        else if (age == 8) {
            System.out.println("Pupille");
        }
        else if (age == 9) {
            System.out.println("Pupille");
        }
        else if (age == 10) {
            System.out.println("Minime");
        }
        else if (age == 11) {
            System.out.println("Minime");
        }
        else if (age > 11) {
            System.out.println("Inconnu");
        }
        else if (age < 7) {
            System.out.println("Inconnu");
        }
    }
}
