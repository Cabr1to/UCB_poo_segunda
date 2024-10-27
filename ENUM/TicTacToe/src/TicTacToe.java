import java.util.Scanner;

enum Cell {
    X, O, EMPTY
}

public class TicTacToe {
    private Cell[][] board;
    private boolean isXTurn;
    private static final int SIZE = 3;

    public TicTacToe() {
        board = new Cell[SIZE][SIZE];
        initializeBoard();
        isXTurn = true; 
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == Cell.EMPTY) {
                    System.out.print("_ ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != Cell.EMPTY) {
            System.out.println("Movimento inválido. Tente novamente.");
            return false;
        }

        board[row][col] = isXTurn ? Cell.X : Cell.O;
        isXTurn = !isXTurn;
        return true;
    }

    public boolean checkWin(Cell player) {
        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == Cell.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayBoard();
            System.out.println("Jogador " + (isXTurn ? "X" : "O") + ", insira a linha e a coluna (0-2) para fazer seu movimento:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (makeMove(row, col)) {
                if (checkWin(Cell.X)) {
                    displayBoard();
                    System.out.println("Jogador X venceu!");
                    break;
                } else if (checkWin(Cell.O)) {
                    displayBoard();
                    System.out.println("Jogador O venceu!");
                    break;
                } else if (isBoardFull()) {
                    displayBoard();
                    System.out.println("O jogo empatou!");
                    break;
                }
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
