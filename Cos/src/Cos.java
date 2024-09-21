import java.util.Scanner;

public class Cos {
    public static Double factorial(double n){
        if(n == 0 || n == 1){
            return 1.0;
        }
        else{
            double fact = 1.0;
            for (double i = n; i > 0; i--) {
                fact *= i;
            }
            return fact;
        }
    }

    public static Double cos(double n){
        double cos = 1;
        for (int i = 0, var = 2; i < 7; var+=2, i++) {
            if( i % 2 == 0){
                cos -= (Math.pow(n, var)/factorial(var));
            }
            if(i % 2 != 0){
                cos += (Math.pow(n, var)/factorial(var));
            }
        }
        return cos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cosseno de: ");
        double x = input.nextDouble();

        System.out.println("O cosseno de "+ String.format("%.0f", x) +" e aproximadamente " + cos(x));
    }
}