import java.util.ArrayList;
import java.util.Scanner;

public class CalculoEstatistico {

    public static ArrayList<Integer> listaNumeros = new ArrayList<>();

    public static void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public static double calcularMedia() {
        double soma = 0.0;
        for (int num : listaNumeros) {
            soma += num;
        }
        return (soma / listaNumeros.size());
    }

    public static double calcularDesvioPadrao() {
        double somaQuadrados = 0.0;
        double media = calcularMedia();
        for (int num : listaNumeros) {
            somaQuadrados += Math.pow((num - media), 2);
        }

        return Math.sqrt(somaQuadrados / (listaNumeros.size() - 1));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos números deseja inserir?");
        int quantidade = entrada.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Insira o número " + (i + 1) + ":");
            int numero = entrada.nextInt();
            adicionarNumero(numero);
        }

        System.out.printf("Média dos números: %.2f\n", calcularMedia());
        System.out.printf("Desvio padrão: %.2f\n", calcularDesvioPadrao());
    }
}
