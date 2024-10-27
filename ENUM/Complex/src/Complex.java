public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public void print() {
        System.out.println("(" + this.real + ", " + this.imaginary + ")");
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 2.5);
        Complex num2 = new Complex(1.2, 4.3);

        System.out.print("Número 1: ");
        num1.print();
        
        System.out.print("Número 2: ");
        num2.print();

        Complex sum = num1.add(num2);
        System.out.print("Soma: ");
        sum.print();

        Complex difference = num1.subtract(num2);
        System.out.print("Subtração: ");
        difference.print();
    }
}
