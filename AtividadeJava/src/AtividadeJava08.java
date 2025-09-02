
import java.util.Scanner;

public class AtividadeJava08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=0  , n2=0 , n3, media = 0;

        System.out.println("Informe a primeira nota do aluno");
        n1 = scanner.nextInt();
        System.out.println("Informe a segunda nota do aluno");
        n2 = scanner.nextInt();
        System.out.println("Informe a terceira nota do aluno");
        n3 = scanner.nextInt();
        media = ((n1 + n2 + n3) / 3);
        System.out.println("A media é: " + media);
    }
}
