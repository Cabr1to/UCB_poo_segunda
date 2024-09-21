import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        double a = 0, p = 0, n = 0, r, aux;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sera a quantidade de R$ aplicado: ");
        p = input.nextDouble();

        System.out.println("Taxa de juros: ");
        r = input.nextDouble();

        System.out.println("Anos: ");
        n = input.nextDouble();

        aux = (1 + r);
        a = p * (Math.pow(n, aux));

        System.out.printf("%.2f", a);
    }
}
