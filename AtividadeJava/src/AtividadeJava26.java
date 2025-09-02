import java.util.Scanner;

public class AtividadeJava26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota final do aluno: ");
        int nf = scanner.nextInt();
        if (nf >= 6) {
            System.out.println("Aprovado");
        } else if (nf < 4) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Recuperação");
        }
    }
}

