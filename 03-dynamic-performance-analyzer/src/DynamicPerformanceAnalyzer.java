import java.util.InputMismatchException;
import java.util.Scanner;

public class DynamicPerformanceAnalyzer {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            while (true) {
                try {
                    int qtd = obterQuantidadeValida(sc);

                    final double[] notas = preencherNotas(qtd, sc);

                    relatorio(calcularMedia(notas), menorNota(notas), maiorNota(notas));

                    System.out.println("Deseja repetir o programa? [S ou N]");
                    if (sc.nextLine().equalsIgnoreCase("n")) break;
                } catch (InputMismatchException e) {
                    System.out.println("ERRO! Entrada inválida. Use números.");
                    sc.next();
                }
            }
        }
    }

    public static int obterQuantidadeValida(Scanner sc) {
        while (true) {
            System.out.println("Quantos alunos existem na sala? ");
            final int qtd = sc.nextInt();
            sc.nextLine();

            if (qtd <= 0) {
                System.out.println("ERRO! A quantidade deve ser maior que zero!");
                continue;
            }
            return qtd;
        }
    }

    public static double[] preencherNotas(int qtd, Scanner sc) {
        double[] notas = new double[qtd];
        for (int i = 0; i < qtd; i++) {
            while (true) {
                try {
                    System.out.printf("Digite a nota do aluno n°%d: ", i + 1);
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    if (nota >= 0 && nota <= 10) {
                        notas[i] = nota;
                        break;
                    }
                    System.out.println("ERRO! A nota deve ser de 0 a 10.");
                } catch (InputMismatchException e) {
                    System.out.println("ERRO! Nota invalida digitada.");
                    sc.next();
                }
            }
        }
        return notas;
    }

    public static double calcularMedia(double[] notas) {
        if (notas.length == 0) {
            return 0;
        } else {
            double somaTotal = 0;
            for (double nota : notas) {
                somaTotal += nota;
            }
            return somaTotal / notas.length;
        }
    }

    public static double menorNota(double[] notas) {
        double menor = notas[0];
        for (int c = 1; c < notas.length; c++) {
            if (notas[c] < menor) {
                menor = notas[c];
            }
        }
        return menor;
    }

    public static double maiorNota(double[] notas) {
        double maior = notas[0];
        for (int c = 1; c < notas.length; c++) {
            if (notas[c] > maior) {
                maior = notas[c];
            }
        }
        return maior;
    }

    public static void relatorio(double media, double menor, double maior) {
        System.out.printf("%nMédia da turma: %.1f | Menor nota da turma: %.1f | Maior nota da turma: %.1f%n%n", media, menor, maior);
    }
}
