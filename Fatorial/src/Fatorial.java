import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int n, resultado = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n = input.nextInt();
        System.out.printf("%d! = ", n);
        for(int i = 1; i <= n; i++){
            resultado *= i;
            if (i < n){
                System.out.printf("%d * ", i);    
            }else{
                System.out.printf("%d\n", i);
            }
        }
        System.out.printf("%d\n", resultado);
    }
}
