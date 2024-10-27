import java.util.Scanner;

public class VerificaPrecoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        assert (preco > 0) : "Erro: O preço do produto deve ser maior que zero.";

        System.out.printf("O preço do produto é: R$ %.2f%n", preco);
        scanner.close();
    }
}

