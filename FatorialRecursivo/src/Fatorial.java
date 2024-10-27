public class Fatorial {
    public static int calcularFatorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Não é possível calcular o fatorial de um número negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}
