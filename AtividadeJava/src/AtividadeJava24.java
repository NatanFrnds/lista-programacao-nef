import java.util.Scanner;

public class AtividadeJava24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int primeiro = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundo = input.nextInt();
        if ((primeiro * segundo) > 100) {
            System.out.println("Quadrado calculado");
        } else {
            System.out.println("Quadrado nao calculado");
        }
    }
}
