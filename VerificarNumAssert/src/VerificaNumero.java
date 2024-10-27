import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero entre 1 e 100: ");
        int numero = scanner.nextInt();

        assert (numero >= 1 && numero <= 100) : "Erro: O numero deve estar entre 1 e 100.";

        System.out.println("Você digitou o numero: " + numero);
        scanner.close();
    }
}
