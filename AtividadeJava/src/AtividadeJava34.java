import java.util.Scanner;
public class AtividadeJava34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor:");
        int n= scanner.nextInt(), cont=0;

        while(cont<=n){
            if(cont%2==0){
                System.out.println(cont);
                cont++;
            }
            cont++;
        }
    }
}
