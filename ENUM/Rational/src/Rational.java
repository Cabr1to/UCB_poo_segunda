public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public Rational() {
        this(0, 1);
    }

    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static Rational add(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }
    
    public static Rational subtract(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational multiply(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.numerator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        int newNumerator = r1.numerator * r2.denominator;
        int newDenominator = r1.denominator * r2.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public String toFloatString() {
        return String.format("%.6f", (double) numerator / denominator);
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

        Rational sum = Rational.add(r1, r2);
        System.out.println("Soma: " + sum + " = " + sum.toFloatString());

        Rational difference = Rational.subtract(r1, r2);
        System.out.println("Subtração: " + difference + " = " + difference.toFloatString());

        Rational product = Rational.multiply(r1, r2);
        System.out.println("Multiplicação: " + product + " = " + product.toFloatString());

        Rational quotient = Rational.divide(r1, r2);
        System.out.println("Divisão: " + quotient + " = " + quotient.toFloatString());
    }
}
