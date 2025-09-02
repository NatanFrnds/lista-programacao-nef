import java.util.Scanner;
public class AtividadeJava28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String diaDaSemana = "O dia equivalente é: ";

        System.out.println("Digite o número do dia da semana:(1-7)");
        int opcao = leia.nextInt();
        switch (opcao){
            case 1:
                diaDaSemana += "Domingo";
                break;
            case 2:
                diaDaSemana += "Segunda-feira";
                break;
            case 3:
                diaDaSemana += "Terça-feira";
                break;
            case 4:
                diaDaSemana += "Quarta-feira";
                break;
            case 5:
                diaDaSemana += "Quinta-feira";
                break;
            case 6:
                diaDaSemana += "Sexta-feira";
                break;
            case 7:
                diaDaSemana += "Sábado";
                break;
            default:
                break;
        }
        System.out.println(diaDaSemana);
    }
}