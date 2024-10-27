import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 'C' para converter de Celsius para Fahrenheit ou 'F' para converter de Fahrenheit para Celsius:");
        String opcao = scanner.nextLine().toUpperCase();

        try {
            System.out.print("Digite a temperatura a ser convertida: ");
            double temperatura = Double.parseDouble(scanner.nextLine());

            switch (opcao) {
                case "C":
                    double fahrenheit = (temperatura * 9/5) + 32;
                    System.out.printf("%.2f graus Celsius e igual a %.2f graus Fahrenheit.%n", temperatura, fahrenheit);
                    break;
                case "F":
                    double celsius = (temperatura - 32) * 5/9;
                    System.out.printf("%.2f graus Fahrenheit e igual a %.2f graus Celsius.%n", temperatura, celsius);
                    break;
                default:
                    System.out.println("Opção invalida. Por favor, escolha 'C' ou 'F'.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor fornecido nao e numerico. Por favor, tente novamente com um numero valido.");
        }
    }
}

