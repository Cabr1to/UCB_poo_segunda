import java.util.Scanner;

public class JogoForca {

    public static void exibirForca(char[] caracteresJogo) {
        for (char c : caracteresJogo) {
            System.err.print(c + " ");
        }
    }

    public static boolean verificarVitoria(char[] palavraJogo) {
        for (char c : palavraJogo) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public static void exibirBoneco(int erros) {
        switch (erros) {
            case 6:
                System.out.println("");
                break;
            case 5:
                System.out.println("  O");
                break;
            case 4:
                System.out.println("  O");
                System.out.println("  |");
                break;
            case 3:
                System.out.println("  O");
                System.out.println(" /|");
                break;
            case 2:
                System.out.println("  O");
                System.out.println(" /|\\");
                break;
            case 1:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" / ");
                break;
            case 0:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" / \\");
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavraSecreta = entrada.next();
        // Não adicionei verificação de palavra e repetição de letra errada

        char[] letrasPalavra = palavraSecreta.toCharArray();

        int tamanhoPalavra = palavraSecreta.length();

        char[] letrasJogo = new char[tamanhoPalavra];
        for (int i = 0; i < tamanhoPalavra; i++) {
            letrasJogo[i] = '_';
        }
        System.out.println("Palavra com " + tamanhoPalavra + " caracteres");
        boolean jogoAtivo = true;
        int tentativasRestantes = 6;

        while (jogoAtivo) {
            exibirForca(letrasJogo);
            System.out.println("Chances restantes: " + tentativasRestantes);
            exibirBoneco(tentativasRestantes);

            System.out.println("Digite uma letra:");
            String tentativa = entrada.next();
            char letra = tentativa.charAt(0);

            boolean acertouLetra = false;

            for (int i = 0; i < tamanhoPalavra; i++) {
                if (letrasPalavra[i] == letra) {
                    letrasJogo[i] = letra;
                    acertouLetra = true;
                }
            }
            if (!acertouLetra) {
                tentativasRestantes--;
            }

            if (verificarVitoria(letrasJogo)) {
                System.out.println("Você venceu!");
                System.out.println("Palavra: " + palavraSecreta);
                jogoAtivo = false;
            }
            if (tentativasRestantes == 0) {
                System.out.println("Você perdeu!");
                exibirBoneco(tentativasRestantes);
                System.out.println("Palavra: " + palavraSecreta);
                jogoAtivo = false;
            }
        }
    }
}
