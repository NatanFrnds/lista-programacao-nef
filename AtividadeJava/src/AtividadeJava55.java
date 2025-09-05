import java.util.Scanner;

public class AtividadeJava55 {
    public static int fatorial(int numero) {
        double count = 1;
        int fatorial = numero;
        while (count < numero) {
            fatorial *= (numero - count);
            System.out.println(numero + "! = " + (fatorial / (numero - count)) + "*" + (numero - count) + "=" + fatorial);
            count++;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AtividadeJava55 func = new AtividadeJava55();
        System.out.println("Digite o numero que deseja saber o fatorial:");
        System.out.println(func.fatorial(scanner.nextInt()));
    }
}
