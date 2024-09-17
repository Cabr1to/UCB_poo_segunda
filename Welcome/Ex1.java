import java.util.Scanner;

public class Ex1
{
  public static void main(String[] args)
  {
    int num1, num2;
    Scanner input = new Scanner(System.in);

    System.out.println("Numero 1: ");
    num1 = input.nextInt();

    System.out.println("Numero 2: ");
    num2 = input.nextInt();

    System.out.printf("Soma: %d + %d = %d\n", num1, num2, num1+num2);
    System.out.printf("Produto: %d * %d = %d\n", num1, num2, num1*num2);
    System.out.printf("Diferenca: %d - %d = %d\n", num1, num2, num1-num2);
    System.out.printf("Divisao: %d / %d = %d\n", num1, num2, num1/num2);
  }




}