import java.util.Scanner;
public class AtividadeJava31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, soma=0;
        do{
            System.out.println("Digite um numero:");
            n=input.nextInt();
                soma+= n;

        }while(n!=0);
        System.out.println(soma);
    }
}
