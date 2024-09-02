import java.util.Scanner;

public class Welcome
{
  public static void main(String[] args)
  {
    int num1, num2;

    Scanner input= new Scanner(System.in);

    System.out.println("Entre com um numero: ");
    num1 = input.nextInt();    
   
    System.out.println("Entre com um numero: ");        
    num2 = input.nextInt();     

    System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
    System.out.printf("raiz quadrada de %d = %f\n", num1, Math.sqrt(num1));
    System.out.printf("%d ao quadrado e %f", num2, Math.pow(num2,2));

  }

	
}