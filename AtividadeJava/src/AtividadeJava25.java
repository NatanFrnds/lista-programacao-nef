import java.util.Scanner;

public class AtividadeJava25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        int salario = scanner.nextInt();
        if (salario > 3000) {
            System.out.println("você paga impostos");
        } else {
            System.out.println("você está isento");
        }
    }
}
