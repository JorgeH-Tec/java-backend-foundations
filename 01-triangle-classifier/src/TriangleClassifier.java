import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        final double[] n = new double[3];
        try (var sc = new Scanner(System.in)) {
            while (true) {
                for (int c = 0; c < n.length; c++) {
                    boolean entrada = false;
                    while (!entrada) {
                        try {
                            System.out.printf("Digite o valor do lado %d: ", c + 1);
                            n[c] = sc.nextDouble();
                            entrada = true;
                        } catch (InputMismatchException e) {
                            System.out.printf("ERRO! Tente digitar o valor do lado %d novamente.%n", c + 1);
                            sc.next();
                        }
                    }
                }

                if ((n[0] + n[1] > n[2]) && (n[1] + n[2] > n[0]) && (n[0] + n[2] > n[1])) {

                    String tipoT;
                    if ((n[0] == n[1]) && (n[1] == n[2])){
                        tipoT = "Equilatero";
                    } else if ((n[0] == n[1]) || (n[1] == n[2]) || (n[0] == n[2])){
                        tipoT = "Isósceles";
                    } else {
                        tipoT = "Escaleno";
                    }

                    System.out.printf("O triângulo é do tipo: %s", tipoT);

                    System.out.println();
                    break;
                } else {
                    System.out.println("ERRO! Esses valores não formam um triângulo, tente novamente.");
                }
            }
        }
    }
}
