import java.util.Scanner;

public class AtividadeJava53 {
public static boolean nprimos (int n){
    boolean primos = true;
    if (n<2){
        return primos=false;
    }else if (n>=2){
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return primos=false;
        }else  {
            return primos=true;
        }
        }
    }
return primos;
}
 public static void  main (String args[]){
    Scanner scanner = new Scanner (System.in);
    AtividadeJava53 func = new AtividadeJava53();
     System.out.println("Digite o numero inteiro que deseja verificar se é primo: ");
     System.out.println(func.nprimos(scanner.nextInt()));
 }
}
