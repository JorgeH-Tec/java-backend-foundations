import java.util.InputMismatchException;
import java.util.Scanner;

public class VectorChange {
    public static void main(String[] args) {
        final int[] n = new int[5];

        try(var sc = new Scanner(System.in)){
            while(true) {
                System.out.println("Qual posição do vetor deseja mudar? [1 à 5]");
                try {
                    final int posicao = sc.nextInt();
                    if (posicao > 0 && posicao <= 5) {
                        System.out.printf("Qual valor voce deseja alocar a %d?%n", posicao);

                        n[posicao - 1] = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Todas as posições:");
                        for (int c = 0; c < n.length; c++) {
                            System.out.printf("Posição %d: %d%n", c+1, n[c]);
                        }

                        System.out.printf("%nDeseja continuar? [S ou N]%n");
                        final String continuar = sc.nextLine();

                        if (continuar.equalsIgnoreCase("n")){
                            System.out.println("Encerrando o programa...");
                            break;
                        }

                    } else {
                        System.out.println("ERRO! A posição deve ser de 1 à 5, tente novamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("ERRO! Digite apenas números inteiros, tente novamente.");
                    sc.next();
                }
            }
        }
    }
}
