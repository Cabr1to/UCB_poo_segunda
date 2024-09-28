public class Array {

    public static void Maior(int[] array) {
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > aux) {
                aux = array[i];
            }
        }
        System.out.println(aux);
    }

    public static void Menor(int[] array) {
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < aux) {
                aux = array[i];
            }
        }
        System.out.println(aux);
    }

    public static void Par(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.printf("%d, ", array[i]);
            }
        }
    }

    public static void Elemento1(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] == array[i]) {
                total++;
            }
        }
        System.out.printf("\n%d vezes\n", total);
    }

    public static void Media(int[] array) {
        int soma = 0;
        float result = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        result = (float) soma / array.length;
        System.out.printf("Media: %.2f\n", result);
    }

    public static void Negativos(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                soma += array[i];
            }
        }
        System.out.printf("%d\n", soma);
    }

    public static void main(String[] args) throws Exception {
        int[] array = { 12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3, -52 };

        Maior(array);
        Menor(array);
        Par(array);
        Elemento1(array);
        Media(array);
        Negativos(array);
    }
}
