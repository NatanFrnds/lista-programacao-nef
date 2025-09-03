import java.util.Scanner;
public class AtividadeJava44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[5];

        System.out.println("Digite as notas da turma");
        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }
        int medias =0;
        for (int i = 0; i < n.length; i++) {
          medias += n[i];
        }
        medias = medias / n.length;
        System.out.println("Medias da turma: " + medias);
    }
}
