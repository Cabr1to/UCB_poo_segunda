import java.util.ArrayList;
import java.util.Scanner;

public class RegistroNotas {

    private static String nomeDisciplina;
    private static ArrayList<Double> listaNotas;

    public RegistroNotas(String disciplina) {
        nomeDisciplina = disciplina;
        listaNotas = new ArrayList<>();
    }

    public static void adicionarNota(Double nota) {
        listaNotas.add(nota);
    }

    public static void setNomeDisciplina(String nome) {
        nomeDisciplina = nome;
    }

    public static String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public static ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public static Double calcularMedia(ArrayList<Double> notas) {
        Double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return (soma / notas.size());
    }

    public static Double[] converterNotasParaArray(ArrayList<Double> notas) {
        Double[] arrayNotas = new Double[notas.size()];
        for (int i = 0; i < notas.size(); i++) {
            arrayNotas[i] = notas.get(i);
        }
        return arrayNotas;
    }

    public static Double maiorNota(ArrayList<Double> notas) {
        Double maior = 0.0;
        for (Double n : notas) {
            if (n > maior) {
                maior = n;
            }
        }
        return maior;
    }

    public static Double menorNota(ArrayList<Double> notas) {
        Double menor = Double.MAX_VALUE;
        for (Double n : notas) {
            if (n < menor) {
                menor = n;
            }
        }
        return menor;
    }

    public static void exibirGrafico(ArrayList<Double> notas) {
        for (Double nota : notas) {
            System.out.printf("%.2f: ", nota);
            for (int i = 0; i < nota; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void gerarRelatorio(Double maior, Double menor, Double media) {
        System.out.println("Nome da disciplina: " + nomeDisciplina);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média das notas: " + media);
    }
}

class TesteRegistroNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina:");
        String nomeCurso = scanner.nextLine();
        RegistroNotas registro = new RegistroNotas(nomeCurso);

        boolean continuar = true;
        int contadorNotas = 1;

        while (continuar) {
            System.out.println("Digite a nota " + contadorNotas + ":");
            Double notaInserida = scanner.nextDouble();
            registro.adicionarNota(notaInserida);
            contadorNotas++;

            System.out.println("Nota adicionada! Deseja inserir outra? (1-sim) (2-não)");
            int opcaoContinuar = scanner.nextInt();
            boolean validaResposta = true;
            while (validaResposta) {
                switch (opcaoContinuar) {
                    case 1:
                        validaResposta = false;
                        break;
                    case 2:
                        validaResposta = false;
                        continuar = false;
                        break;
                    default:
                        System.err.println("Resposta inválida! Tente novamente!");
                }
            }
        }

        ArrayList<Double> listaFinalNotas = registro.getListaNotas();
        registro.gerarRelatorio(registro.maiorNota(listaFinalNotas), registro.menorNota(listaFinalNotas),
                registro.calcularMedia(listaFinalNotas));
        registro.exibirGrafico(listaFinalNotas);
    }
}
