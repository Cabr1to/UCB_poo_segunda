public class Produto {
    public static void main(String[] args) {
        int n = 15, total = 1;
        for (int i = 1; i <= n; i+=2){
            total *=  i;
        }
        System.out.printf("Total: %d", total);
    }
}
