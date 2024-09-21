import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para eleva-lo ao quadrado: ");
        int n = input.nextInt();
        int resultado = 0;

        for (int i = 1, count = 0; count < n; count++, i+=2) {
            resultado += i;
        }
        System.out.println(n + " ao quadrado = "+ resultado);
    }
}

