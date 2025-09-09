package Exemplo3;
import java.util.Scanner;
public class Exemplo03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Pessoa pessoa = new Pessoa(19,"Pedro");
            System.out.println("Digite seu novo nome: ");
            String antigoNome = pessoa.getNome();
            pessoa.setNome(scanner.next());
            pessoa.falar();
            System.out.println("nome antigo: "+antigoNome);
        }
    }
