import java.util.Scanner;

public class VerificaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas deseja inserir? ");
        int quantidadeNotas = scanner.nextInt();
        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();

            assert (notas[i] >= 0 && notas[i] <= 10) : "Erro: Cada nota deve estar entre 0 e 10.";
        }

        System.out.println("Todas as notas foram inseridas corretamente.");
        scanner.close();
    }
}
