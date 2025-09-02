import java.util.Scanner;

public class AtividadeSala15 {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double poten(double a, double b) {
        return Math.pow(a, b);
    }

    public static String printResultado(char op, double a, double b, double resul) {
        String texto = a + " " + op + b + " = " + resul + "\n";
        System.out.println(texto);
        return texto;
    }

    public static void imprimir(double resul) {
        System.out.println(resul);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char op = '0';
        String historico = "Histórico: \n";

        do {
            System.out.println("Digite os valores que deseja realizar uma operação: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Escolha digite o numero referente a operação que você deseja realizar" + " \n Sair= 0\n1= Soma\n 2=Subtração\n 3=multiplicação\n 4=Divisão\n 5=potencia");
            op = scanner.next().charAt(0);
            switch (op) {
                case '1':
                    System.out.println("soma de" + a + " " + b);
                    imprimir(soma(a, b));
                    historico += printResultado('+', a, b, soma(a, b));
                    break;
                case '2':
                    System.out.println("subtração de" + a + " " + b);
                    imprimir(sub(a, b));
                    historico += printResultado('+', a, b, sub(a, b));
                    break;
                case '3':
                    System.out.println("multiplicação de" + a + " " + b);
                    imprimir(mult(a, b));
                    historico += printResultado('+', a, b, mult(a, b));
                    break;
                case '4':
                    System.out.println("divisão de" + a + " " + b);
                    imprimir(div(a, b));
                    historico += printResultado('+', a, b, div(a, b));
                    break;
                case '5':
                    System.out.println("potencia de" + a + " " + b);
                    imprimir(poten(a, b));
                    historico += printResultado('+', a, b, poten(a, b));
                    break;
                case '0':
                    System.out.println("Obrigado por utilizar o programa!");
                    System.out.println("Segue abaixo o resumo das operações realizadas.");
                    System.out.println(historico);
                    break;
                default:
            }
        } while (op != '0');
    }

}
