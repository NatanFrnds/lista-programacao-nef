import java.util.Scanner;

public class AtividadeJava39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite numero ");
        int n = scanner.nextInt(), b = 0;
        for (int i = 0; i < 10; i++) {
            int pxt = n + b;
            n = b;
            b = pxt;
            System.out.print(n + " ");
        }
    }
}
