public class TesteFatorial {
    public static void main(String[] args) {
        try {
            int numero = 5;  
            int resultado = Fatorial.calcularFatorial(numero);
            System.out.printf("O fatorial de %d é %d.%n", numero, resultado);

            numero = -3;  
            resultado = Fatorial.calcularFatorial(numero);
        } catch (NegativeNumberException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
