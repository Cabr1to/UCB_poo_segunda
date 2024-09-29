import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lugares_vagos = { 10, 2, 1, 3, 0 };

        boolean status = true;

        while (status) {
            System.out.println("Digite o numero da sala requerida ( 1, 2, 3, 4, 5) (sair - 0)");
            int sala = scanner.nextInt();
            if (sala <= 0) {
                System.out.println("Saindo.");
                System.exit(0);
            }

            System.out.println("Digite quantos assentos voce quer");
            int assentos = scanner.nextInt();

            if (assentos <= 0) {
                System.out.println("O número de assentos nao pode ser 0 ou menor...");
                sala = -1; 
            }

            switch (sala) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Verificando disponibilidade de " + assentos + " assento(s) na sala " + sala);
                    if (lugares_vagos[(sala - 1)] >= assentos) {
                        System.out.println("Assentos adquiridos, obrigado!");
                        lugares_vagos[(sala - 1)] -= assentos;
                        System.out.println("Deseja realizar outra compra? (sim - 1  /  nao - 0)");
                        int ans2 = scanner.nextInt();
                        if (ans2 == 0) {
                            System.out.println("Obrigado! Encerrando...");
                            System.exit(0);
                        }
                    } else {
                        System.out.println("Esta sala nao possui esta quantidade de lugares disponiveis");
                    }
                    break;
                default:
            }
        }
    }
}