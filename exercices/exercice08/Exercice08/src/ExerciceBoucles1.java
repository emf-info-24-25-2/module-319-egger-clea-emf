public class ExerciceBoucles1 {
    public static void main(String[] args) throws Exception {
        for (int iteration=1; iteration<6; iteration++){
            System.out.println("Boucles for, iteration"+ iteration);
        }
        int iteration = 0;
        while (iteration<5) {iteration++;
            System.out.println("Boucle while, iteration"+ iteration);
        }
        int iteration2 = 1;
        do {
            System.out.println("Boucle do-while, iteration"+ iteration2);
            iteration2++;
        } while (iteration2<=5);
            
    }
}
