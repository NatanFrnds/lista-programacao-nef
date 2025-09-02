import java.util.Scanner;

public class AtividadeJava09 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base = 0;
        int altura = 0;
        int perim = 2 * (base + altura);
        System.out.println("Escreva base");
        base = ler.nextInt();
        System.out.println("Escreva altura");
        altura = ler.nextInt();
        perim = 2 * (base + altura);
        System.out.println("O perimetro é: "+perim);
    }
}
