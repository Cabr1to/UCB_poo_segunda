import java.util.Scanner;

public class Cript {
    
    public static void criptografar(){
        int num, primeiro, segundo, terceiro,quarto;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 numero com 4 digitos: ");
        num = input.nextInt();
        System.out.printf("O numero %d sera codificado...\n", num);
        primeiro = (num%10000)/1000;
        segundo = (num%1000)/100;
        terceiro = (num%100)/10;
        quarto = num%10;

        primeiro = (primeiro + 7) % 10;
        segundo = (segundo + 7) % 10;
        terceiro = (terceiro + 7) % 10;
        quarto = (quarto + 7) % 10;

        System.out.printf("%d %d %d %d\n", terceiro, quarto, primeiro, segundo);
    }
    public static void main(String[] args) {
        Cript.criptografar();

    }
}
