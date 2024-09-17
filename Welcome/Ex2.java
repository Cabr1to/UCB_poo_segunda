import java.util.Scanner;

public class Ex2
{
  public static void main(String[] args)
  {
    int num1, aux;
    Scanner input = new Scanner(System.in);

    System.out.println("Entre com um numero de 5 digitos: ");
    num1 = input.nextInt();
   
    int n1 = num1%10000;
    int n2 = num1%1000;
    int n3 = num1%100;
    int n4 = num1%10;    

    System.out.printf("%d   %d   %d   %d   %d", num1/10000, n1/1000, n2/100, n3/10, n4);
  }
}

     
    
    
     