import java.util.Scanner;

public class AtividadeSala02 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        String nome = "Natan";
        String sobrenome = "Fernandes";
        int idade = 22;
        double peso = 65.5;
        double altura = 1.80;
        double imc = 0;
        int anonasc = 2025 - idade;
        String texto ="Peso: "+ +peso+" altura:"+altura ;
        System.out.println("Nome e sobrenome: "+ nome + " " + sobrenome);
        System.out.println("ano de nascimento: " + anonasc);
        System.out.println(texto);
       imc = peso/(altura*altura);
       System.out.println("IMC: " + imc);

    }

}
