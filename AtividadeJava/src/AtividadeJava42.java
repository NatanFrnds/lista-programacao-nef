import java.util.Scanner;

public class AtividadeJava42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n;
        n = new int[10];
        System.out.println("Digite os 10 numeros que vão ser armazenados no vetor");
        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.print(n[i]);
            }
        }
    }
}
