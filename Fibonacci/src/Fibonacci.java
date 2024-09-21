import java.util.Scanner;
public class Fibonacci{

    public static Double fib(int n){
        int  x2 = 1;
        if (n < 3) {
            System.out.println("Insira um numero > 3");
        }
        else{
            int aux = 1, x1 = 1;
            for (int i = 0; i < (n-1); i++) {
                x1 += x2;
                x2 = aux;
                aux = x1;
            }
            
        }
        return (double)x2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = sc.nextInt();

        System.out.println("O "+ n + "o termo da sequencia e "+ String.format("%.0f", fib(n)));
    }
}