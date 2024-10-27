import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Digite o preço do produto: R$");
                    double preco = scanner.nextDouble();

                    try {
                        Produto produto = new Produto(nome, preco);
                        produtos.add(produto);
                        System.out.println("Produto cadastrado com sucesso!");
                    } catch (PrecoInvalidoException e) {
                        System.out.println("Erro ao cadastrar produto: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\nProdutos cadastrados:");
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto produto : produtos) {
                            System.out.println(produto);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema. Obrigado!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
