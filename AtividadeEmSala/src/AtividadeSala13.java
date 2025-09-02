import java.util.Scanner;

public class AtividadeSala13 {

    public static void printBoletim(String[] vetor, double[][] matriz){
        for (int linha = 0; linha < 3; linha++) {
            System.out.println(vetor[linha]);
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println((coluna + 1) + " etapa: "
                        + matriz[linha][coluna] + " pontos");
            }
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
//MATRIZES
//double[][] boletim = new double[3][3];
        double[][] boletim = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        String[] materias = {"Matemática", "Português", "Física"};
        for (int linha = 0; linha < 3; linha++) {
            System.out.println("Digite as notas de " + materias[linha]);
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Digite a nota do " + (coluna + 1) + "º trimestre");
                boletim[linha][coluna] = leia.nextDouble();
            }
        }
        System.out.println("Boletim:");
        // Matemática:
        // 1ª etapa: 10 pontos
        // 2ª etapa: 10 pontos
        // 3ª etapa: 10 pontos
        printBoletim(materias, boletim);


    }
}