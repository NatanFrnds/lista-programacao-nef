import java.util.Scanner;

public class AtividadeJava57 {
    public static void Parorimpar(int n) {
        if (n%2==0) {
            System.out.println("é par");
        }else{
            System.out.println("é impar");
        }
    }
    public static void main(String [] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero que deseja saber sde é par ou impar: ");
        int n=input.nextInt();
        Parorimpar(n);
    }
}
