import java.util.Scanner;

public class AtividadeJava43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[8];

        System.out.println("Digite os 8 numeros que vão ser armazenados no vetor");
        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }
        int k = n[0];
        int m = n[0];
        for (int i = 0; i < n.length; i++) {

            if (n[i] > k) {
                k = n[i];
            }

        }
        for (int i = 0; i < n.length; i++) {

            if (n[i] < m) {
                m = n[i];
            }

        }
        System.out.println("O maior numero digitado foi: " + k + "\n O menor numero digitado foi: " + m + "\n");
    }
}


