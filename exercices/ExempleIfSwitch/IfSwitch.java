package exercices.ExempleIfSwitch;

public class IfSwitch {
    public static void main(String[] args) {
        int note = 3;

        if (note < 4) {
            System.out.println("ma note est insuffisante.");
        } else if (note < 6) {
            System.out.println("Ma note est suffisante mais peut être améliorée");
        } else {
            System.out.println("Parafit");
        }

        System.out.println("ma note est : " + note);

        // Test avec switch
        switch (note) {
            case 1:
                System.out.println("j'ai triché, c'est mal");

                break;
            case 2:
                System.out.println("Y a du boulot");
                break;
            case 3:
                System.out.println("juste juste");
                break;
            case 4:
                System.out.println("bravo");

            default:
                System.out.println("note incoréente");
                break;
        }
    }
}
