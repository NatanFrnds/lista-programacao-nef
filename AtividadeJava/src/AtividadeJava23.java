import java.util.Scanner;

public class AtividadeJava23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero deseja verificar:");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("é Par");
        } else {
            System.out.println("é impar");
        }
    }
}
