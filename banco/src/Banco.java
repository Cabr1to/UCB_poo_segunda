import java.util.Scanner;

public class Banco {

    private static double saldo = 0;
    public static int aux = 0;

    public static void getSaldo(){
        System.out.printf("SALDO = %.2f", saldo);
        if(saldo == 0){
            System.out.printf("\nDeposite dinheiro na sua conta.", saldo);
        }
    }

    public static void depositar(){
        double n = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos R$ deseja depositar?");
        n = input.nextDouble();
        saldo += n;
        System.out.printf("SALDO = R$%.2f", saldo);
    }

    public static void main(String[] args){
        int op;
        Scanner input = new Scanner(System.in);

        System.out.println("[1] - Mostrar saldo\n[2] - Depositar");
        op = input.nextInt();
        switch (op) {
            case 1:
                getSaldo();
                break;
            case 2:
                do{
                   depositar();
                   System.out.println("\n[0] - Continuar\n[1] - Sair");
                    aux = input.nextInt();
                    if (aux == 1){
                        break;
                    }
                }while (aux == 0);
                break;
            default:
                break;
        }
    }
}
