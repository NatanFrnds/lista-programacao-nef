import java.sql.SQLOutput;
import java.util.Scanner;

public class AtividadeSala10 {
public  static void main(String args[]){
	Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor que você quer saber a tabuada");
    int x = ler.nextInt();
    int cont=0;
    while(cont<=10){
        System.out.println(x+"*"+cont+"= " + cont*x);
        cont++;
    }
}
}
