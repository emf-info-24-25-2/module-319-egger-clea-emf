package exercices.exercice06;

public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int age=3;

        if (age == 7) {
            System.out.println("Poussin");
        }
        else if (age > 7 && age < 10) {
            System.out.println("Pupille");
        }
        else if (age > 9 && age < 12) {
            System.out.println("Minime");
        }
        else if (age > 11 && age < 7) {
            System.out.println("Inconnu");
        }
    }
}