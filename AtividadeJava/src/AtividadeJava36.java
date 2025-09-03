import  java.util.Scanner;
public class AtividadeJava36 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            System.out.println("Digite um número inteiro para calcular o fatorial:");
            int numero = leia.nextInt();
            int fatorial = numero, count = 1;
            while (count < numero) {
                fatorial *= (numero - count);//fatorial = fatorial * (numero - count)
                System.out.println(numero + "! = " + (fatorial / (numero - count)) + "*" + (numero - count) + "=" + fatorial);
                count++;
            }
            System.out.println("O fatorial de " + numero + " é:" + fatorial);
        }
    }
