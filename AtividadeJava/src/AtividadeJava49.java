import  java.util.Scanner;
public class AtividadeJava49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] n = new int[3][2];
        String[] nomes = new String[3];

        for (int i = 0; i < n.length; i++){
            System.out.println("Ensira o nome dos alunos:");
            nomes[i] = scanner.nextLine();
        }
        for (int i = 0; i < n.length; i++){
            System.out.println("Aluno "+ nomes[i] +" Ensira as notas dele");
            for (int j = 0; j < n.length; j++){
                for (int k = 0; k < n.length; k++){
                    n[j][k] =scanner.nextInt();
                }
            }
        }
    }
}

