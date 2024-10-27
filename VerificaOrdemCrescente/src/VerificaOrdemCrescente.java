import java.util.Scanner;

public class VerificaOrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        assert numero1 < numero2 && numero2 < numero3 : "Os números não estão em ordem crescente!";

        System.out.println("Os números estão em ordem crescente.");
        
        scanner.close();
    }
}
