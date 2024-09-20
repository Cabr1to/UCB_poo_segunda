import java.util.Scanner;

public class Credito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numeroConta = input.nextInt();
        
        System.out.println("Digite o saldo no inicio do mes: ");
        int saldoInicial = input.nextInt();
        
        System.out.println("Digite o total de itens cobrados esse mes: ");
        int totalCobrados = input.nextInt();
        
        System.out.println("Digite o total de creditos aplicados neste mes: ");
        int totalCreditos = input.nextInt();
        
        System.out.println("Digite o limite de crédito autorizado: ");
        int LimiteCreditos = input.nextInt();
        
        int saldoFinal = saldoInicial + totalCobrados - totalCreditos;

        System.out.println("Conta numero: "+ numeroConta);
        System.out.println("Novo saldo: " + saldoFinal);
        
        if (saldoFinal > LimiteCreditos) {
            System.out.println("Limite de credito excedido");
        } else {
            System.out.println("Limite de crédito ok");
        }
    }
}
