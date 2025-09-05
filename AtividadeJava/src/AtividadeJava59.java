import java.util.Scanner;

public class AtividadeJava59 {
    public static void mediaArimetica(double[] vetor) {
        double media = 0, soma = 0;
        int nItens = vetor.length;
        for (int i = 0; i < nItens; i++) {
            soma += vetor[i];
            if (i==nItens-1) {
                media = soma/nItens;
                System.out.println(media);
            }
        }
    }


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] valores= {1,2,3,4,5,6,7,8,9,10};
        mediaArimetica(valores);
    }
}
