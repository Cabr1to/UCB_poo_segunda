import java.util.Scanner;

public class App {
    public static Integer aux = null;
    public static void main(String[] args) {
        int n, num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos numeros serao escritos: ");
        n = input.nextInt();
        System.out.println(" ");

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            num = input.nextInt();
            if (aux == null){
                aux = num;
            }          
            if(num < aux){
                aux = num;
            }
        }
        System.out.printf("O menor numero: %d", aux);  
    }
}
