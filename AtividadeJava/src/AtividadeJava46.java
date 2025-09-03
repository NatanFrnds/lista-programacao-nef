import java.util.Scanner;

public class AtividadeJava46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[2][2];
        int soma = 0;
        System.out.println("Digite os numeros para serem armazenados");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                soma += a[i][j];
            }
        }
        System.out.println(soma);
    }
}
