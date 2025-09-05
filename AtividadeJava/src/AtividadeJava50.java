import  java.util.Scanner;
public class AtividadeJava50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  [][] n = new int [3][3];
        int  [][] m = new int [3][3];
        System.out.println("Digite os numeros");
        for  (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = scanner.nextInt();
            }
        }
        for  (int i = 0; i < n.length; i++) {
            for(int j = 0; j < n.length; j++) {
                m[i][j] = n[i][j]*n[i][j];
                System.out.println("O quadrado do "+n[i][j]+" é "+m[i][j]);
            }
        }
    }
}

