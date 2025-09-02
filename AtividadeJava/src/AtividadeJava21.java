import java.util.Scanner;

public class AtividadeJava21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: (0-9)");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: (0-9)");
        double n2 = scanner.nextDouble();

        if (n1 >= 6 && n2 >= 6) {
            System.out.println("Aprovado");
        } else if (n1 >= 4 || n2 >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}

