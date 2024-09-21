public class Pi {
    public static void main(String[] args) {
        double pi = 0;
        long max = 200000;
        double divisor = 1;

        for (int i = 0; i < max; i++) {
            
            pi += 4/divisor;
            pi *= -1;
            divisor += 2;
        }
        System.out.println("Aproximadamente " + max + " termos: " + pi);
    }
}