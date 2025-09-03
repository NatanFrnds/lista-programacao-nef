import java.util.Scanner;

public class AtividadeJava47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] n = new int[3][3];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i == j) {
                    System.out.println(n[i][j]);
                }
            }
        }

    }
}
