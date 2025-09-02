import java.util.Scanner;

public class AtividadeJava22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero que vai ser testado: ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("O numero é positivo");
        } else if (n == 0) {
            System.out.println("Numero é igual a zero");
        } else {
            System.out.println("Numero é negativo");
        }
    }
}

