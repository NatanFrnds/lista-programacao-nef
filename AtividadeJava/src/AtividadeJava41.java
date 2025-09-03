import java.util.Scanner;
public class AtividadeJava41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] n;
        n = new int[5];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite os numeros que vão ser armazenados no vetor");
            n[i] = scanner.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println("Vetor"+i+"="+n[i]);
        }
    }
}
