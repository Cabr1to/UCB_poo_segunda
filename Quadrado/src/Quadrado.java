import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        int lado;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho do quadrado: ");
        lado = input.nextInt();
        
        for(int i = 0; i < lado; i++){
            if(i == 0 || i == (lado-1)){
                for (int j = 0; j < lado; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            else{
                System.out.print("*");
                for (int j = 1; j < (lado - 1); j++) {
                System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");
            }
        }
    }   
}
