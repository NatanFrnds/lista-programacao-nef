import java.util.Scanner;

public class AtividadeSala07 {

    public static void main(String[] args) {
        //Exemplo com o SE(IF)
        int a = 5, b = -5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0) {
            System.out.println("Todos os valores são negativos.");
        } else if (a < 0 || b < 0 || x < 0 || y < 0) {
            System.out.println("Pelo menos um valor é negativo.");
        } else {
            System.out.println("Todos os valores são positivos");
        }
        //Exemplo com o Escolha (Switch/Case)
        char opcao = 'S';
        switch (opcao) {
            case 'S':
                System.out.println("A opção 'S' foi escolhida");
                break;
            case 'N':
                System.out.println("A opção 'S' foi escolhida");
                break;
            default:
                System.out.println("A opção escolhida é inválida");
                break;
        }

        Scanner scanner = new Scanner(System.in);
        String nome = "";
        System.out.println("Digite seu nome: :");
        scanner.nextLine();
        int idade = 0;
        System.out.println("Digite sua idade:");
       idade= scanner.nextInt();

        if (idade < 18) {
            System.out.println(nome + " é menor de idade");
        } else if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        }

        System.out.println("Digite seu sexo: em caracter sendo 'm' para masculino e 'f' para feminino ou  'o' para outros");
        char sexo = scanner.nextLine().toLowerCase().charAt(0);

        switch (sexo) {
            case 'm':
                System.out.println(" Você se considera do sexo Masculino");
                break;
            case 'f':
                System.out.println("Você se considera do sexo Feminino");
                break;
            case 'O':
                System.out.println("Você se considera do sexo Outros");
                break;

        }
    }
}

