public class App {

    public static final int NRB_ESSAIS=1000000;

    public static void main(String[] args) {
        int compteur=0;
        for (int i = 0; i < NRB_ESSAIS; i++) {
            double x = Math.random();
            double y = Math.random();

            double hypothenuse = Math.sqrt(x*x + y*y);

            if(hypothenuse<1){
                compteur ++;
            }
        }

        //Calcule de pi
        double estimation = 4*(double)compteur/NRB_ESSAIS;

        System.out.println("PI = ~"+ estimation);
    }
}
