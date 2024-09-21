import java.util.Scanner;

public class Primo{
    public static boolean ehprimo(int n){
        if (n <= 1) {
        return false;
    }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if(ehprimo(n) == true){
            System.out.println("é primo");
        }
        else{
            System.out.println("não é primo");
        }
    }
}