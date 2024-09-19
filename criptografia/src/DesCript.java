import java.util.Scanner;

public class DesCript {
    public static void descriptografar(){
        int num, primeiro, segundo, terceiro,quarto;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero para descriptografar: ");
        num = input.nextInt();

        primeiro = (num%10000)/1000;
        segundo = (num%1000)/100;
        terceiro = (num%100)/10;
        quarto = num%10;

        System.out.printf("%d %d %d %d\n", primeiro, segundo, terceiro, quarto);


        primeiro = ((primeiro % 10)+ 10 - 7) %10;
        segundo = ((segundo % 10)+ 10 - 7) % 10;
        terceiro = ((terceiro % 10)+ 10 - 7) % 10;
        quarto = ((quarto % 10)+ 10 - 7) % 10;

        System.out.printf("\n%d %d %d %d", terceiro, quarto, primeiro, segundo);

    }
    public static void main(String[] args) {
        DesCript.descriptografar();

    }
}
