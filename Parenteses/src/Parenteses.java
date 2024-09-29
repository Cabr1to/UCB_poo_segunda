import java.util.Scanner;

public class Parenteses {
    public static int occurrencies = 0;

    public static boolean verifyParenteses(char p) {
        if (p == '(') {
            occurrencies++;
            return true;
        }
        if (p == ')') {
            occurrencies--;
            if (occurrencies == 0) {
                return true;
            }
            if (occurrencies < 0 || occurrencies > 0) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com uma expressão de parenteses:");
        String pa = scanner.next();

        char[] p = pa.toCharArray();
        if (p[0] == ')') {
            System.out.println("ERROR");
            System.exit(0);
        }
        for (char cr : p) {
            result = verifyParenteses(cr);
            if (result == false) {
                break;
            }
        }

        if (result == true) {
            System.out.println("OK!");
            System.exit(1);
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }

    }
}