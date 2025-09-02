import java.util.Scanner;

public class AtividadeSala12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas= {0,0,0};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite sua primeira nota: ");
            notas[i] = input.nextDouble();
            if (i==notas.length-1) {
                System.out.println("A media das notas é" + (notas[0] + notas[1] + notas[2]) / 3);
        }
        }
    }
}
