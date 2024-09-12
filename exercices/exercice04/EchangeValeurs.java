package exercices.exercice04;

public class EchangeValeurs {
    
        public static void main(String[] args) {
            int variable1=6;
            int variable2=13;

            System.out.println("Le contenue de la variable 1 est" + variable1 );
            System.out.println("Le contenue de la variable 2 est" + variable2);

            int variable3;

            variable3=variable1;
            variable1=variable2;
            variable2=variable3;

            System.out.println(".... Traitemant ....");
            System.out.println("Le contenue de la valeur 1 est" + variable1);
            System.out.println("Le contenue de la valeur 2 est" + variable2);
        }
}
