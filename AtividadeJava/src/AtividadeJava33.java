import java.util.Scanner;

public class AtividadeJava33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 0, soma = 0, cont = 0;
        double media = 0;

        do {
            System.out.println("Digite sua idade");
            idade = input.nextInt();

            if (idade >= 0) {
                soma += idade;
                cont++;
            }
        } while (idade > 0);
        media = soma / cont;
        System.out.println(media);
    }
}
