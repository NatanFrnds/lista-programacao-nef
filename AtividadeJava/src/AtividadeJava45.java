import java.util.Scanner;

public class AtividadeJava45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        for (int i = 0; i < a.length; i++) {

            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] =a[i]+b[i];
            System.out.println( "no "+i+ " vetor está " +c[i]);
        }
    }
}
