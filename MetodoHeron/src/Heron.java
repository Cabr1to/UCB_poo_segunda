import java.util.Scanner;

public class Heron{
    public static Double heron(double N){
        double k = 1.0;
        for (int i = 0; i < 10; i++) {
            k = (k+(N/k))/2;
        }
        return k;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Raiz quadrada aproximada: ");
        int n = sc.nextInt();
        System.out.println("A raiz aproximada de "+ n +" e igual a "+ String.format("%.2f", heron(n)));
    }
}