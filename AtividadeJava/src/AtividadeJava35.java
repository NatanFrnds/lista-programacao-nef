import java.util.Scanner;

public class AtividadeJava35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, n2 = 0;
        System.out.println("Digite um valor qualquer ate acertar o valor que vai parar o codigo:");
        while (n != -1) {
            if (n > n2) {
                n2 = n;
            }
            n = scanner.nextInt();
        }
        System.out.println(n2);
    }
}
