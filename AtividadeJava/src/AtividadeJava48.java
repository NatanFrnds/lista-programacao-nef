import java.util.Scanner;
public class AtividadeJava48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] n = new int[4][4];
        int maior=n[0][0];
        String local="";
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i][j] > maior) {
                    maior = n[i][j];
                    local ="Posição:"+" linha "+i+" coluna "+j+"\n"+maior;
                }
            }
        }
        System.out.println(local);
    }
}
