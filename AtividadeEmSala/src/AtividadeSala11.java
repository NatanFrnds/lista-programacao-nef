import java.util.Scanner;

public class AtividadeSala11 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        double nota1=0, nota2=0, nota3=0, media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor da " + (i+1) + " nota do aluno:");
            switch (i) {
                case 0:
                    nota1 = ler.nextDouble();
                    break;
                case 1:
                    nota2 = ler.nextDouble();
                    break;
                case 2:
                    nota3 = ler.nextDouble();
                    break;
                default:
                    break;
            }
        }
        media=(nota1+nota2+nota3)/3;
        System.out.println("media: "+media);
    }
}
