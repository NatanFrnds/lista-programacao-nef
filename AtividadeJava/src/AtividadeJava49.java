import java.util.Scanner;

public class AtividadeJava49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] n = new int[3][2];
        String[] nomes = new String[3];


        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Ensira o nome do alunos:");
            nomes[i] = scanner.next();
            double media = 0, soma=0;
            for (int j = 0; j < n[i].length; j++) {
                System.out.println("Aluno " + nomes[i] + " ensira a nota");
                n[i][j] = scanner.nextInt();
                soma += n[i][j];
            }
            media = soma/n[i].length;
            System.out.println(media);
        }

            }
        }




