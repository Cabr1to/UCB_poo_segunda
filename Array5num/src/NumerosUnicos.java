import java.util.Scanner;

public class NumerosUnicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] uniqueNumbers = new int[5];
        int uniqueCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o numero " + (i + 1) + " (entre 10 e 100): ");
            int num = scanner.nextInt();

            if (num >= 10 && num <= 100) {

                boolean isDuplicate = false;
                for (int j = 0; j < uniqueCount; j++) {
                    if (uniqueNumbers[j] == num) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    uniqueNumbers[uniqueCount] = num;
                    uniqueCount++;
                    System.out.println("Numero " + num + " adicionado.");
                } else {
                    System.out.println("Numero " + num + " duplicado. Nao sera adicionado.");
                }
            } else {
                System.out.println("Numero fora do intervalo. Insira um numero entre 10 e 100.");
            }

            System.out.print("Conjunto atual de valores unicos: ");
            for (int j = 0; j < uniqueCount; j++) {
                System.out.print(uniqueNumbers[j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
