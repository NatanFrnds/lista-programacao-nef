import java.util.Scanner;
public class AtividadeJava32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int senha=0;
        do{
            System.out.println("Digite ate acertar a senha numerica de quatro numeros:");
           senha=scanner.nextInt();
        }while (senha!=1234);
        System.out.println("Senha correta");
    }
}
