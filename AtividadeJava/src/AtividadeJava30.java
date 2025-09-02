import java.util.Scanner;
public class AtividadeJava30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algumas das opções: a,b,c ou d");
        char letra=scanner.next().charAt(0);


        switch(letra) {
            case 'a':
                System.out.println("Seu vagabundo");
                break;
                case 'b':
                    System.out.println("Seu vagando que escolheu letra b");
                    break;
                    case 'c':
                        System.out.println("Seu vagando que escolheu letra c");
                        break;
                        case 'd':
                            System.out.println("Seu vagando que escolheu letra d");
                            break;
                            default:
            System.out.println("Opcão invalida");
            break;
        }

    }
}
