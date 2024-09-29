import java.util.Scanner;

public class JogoDaVelha {

    public static char[][] campo = new char[3][3];
    public static char vencedor;

    public static void inicializarCampo() {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                campo[i][j] = ' ';
            }
        }
    }

    public static void exibirCampo() {
        int linha = 1;
        for (char[] row : campo) {
            for (char celula : row) {
                System.out.print("[ " + celula + " ]");
            }
            System.out.println(" " + linha);
            linha++;
        }
        System.out.println("  1    2    3 ");
    }

    public static boolean jogar(int linha, int coluna, int jogador) {
        // Verificar se a posição está livre
        if (campo[(linha - 1)][(coluna - 1)] == ' ') {
            campo[(linha - 1)][(coluna - 1)] = simboloJogador(jogador);
            return false;
        } else {
            System.err.println("Essa posição já está ocupada");
            return true;
        }
    }

    public static int alternarJogador(int jogadorAtual) {
        return (jogadorAtual == 1) ? 2 : 1;
    }

    public static char simboloJogador(int jogador) {
        if (jogador == 1) {
            return 'X';
        } else if (jogador == 2) {
            return 'O';
        } else {
            return ' ';
        }
    }

    public static boolean verificarEmpate() {
        int posicoesPreenchidas = 0;
        for (char[] row : campo) {
            for (char celula : row) {
                if (celula != ' ') {
                    posicoesPreenchidas++;
                }
            }
        }
        return posicoesPreenchidas == 9;
    }

    public static boolean verificarVencedor() {
        return checarVitoria('X') || checarVitoria('O');
    }

    private static boolean checarVitoria(char jogador) {
        // Linhas
        if (campo[0][0] == jogador && campo[0][1] == jogador && campo[0][2] == jogador) { vencedor = jogador; return true; }
        if (campo[1][0] == jogador && campo[1][1] == jogador && campo[1][2] == jogador) { vencedor = jogador; return true; }
        if (campo[2][0] == jogador && campo[2][1] == jogador && campo[2][2] == jogador) { vencedor = jogador; return true; }
        
        // Colunas
        if (campo[0][0] == jogador && campo[1][0] == jogador && campo[2][0] == jogador) { vencedor = jogador; return true; }
        if (campo[0][1] == jogador && campo[1][1] == jogador && campo[2][1] == jogador) { vencedor = jogador; return true; }
        if (campo[0][2] == jogador && campo[1][2] == jogador && campo[2][2] == jogador) { vencedor = jogador; return true; }
        
        // Diagonais
        if (campo[0][0] == jogador && campo[1][1] == jogador && campo[2][2] == jogador) { vencedor = jogador; return true; }
        if (campo[2][0] == jogador && campo[1][1] == jogador && campo[0][2] == jogador) { vencedor = jogador; return true; }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogoEmAndamento = true;
        int jogadorAtual = 1;
        inicializarCampo();

        while (jogoEmAndamento) {
            boolean jogadaInvalida = true;
            while (jogadaInvalida) {
                System.out.println("Vez do jogador " + jogadorAtual);
                exibirCampo();
                System.out.println("Digite as coordenadas: (linha 1 2 3) e (coluna 1 2 3)");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                jogadaInvalida = jogar(linha, coluna, jogadorAtual);
            }

            if (verificarVencedor()) {
                exibirCampo();
                System.out.println("Vitória do jogador '" + vencedor + "'!");
                jogoEmAndamento = false;
            }

            if (verificarEmpate()) {
                exibirCampo();
                System.out.println("Empate!");
                jogoEmAndamento = false;
            }

            jogadorAtual = alternarJogador(jogadorAtual);
        }
    }
}
