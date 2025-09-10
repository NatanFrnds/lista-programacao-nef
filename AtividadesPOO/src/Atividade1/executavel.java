package Atividade1;

import java.util.Scanner;

public class executavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lampada lampada = new lampada();
        System.out.println("Digite o brilho: ");
        lampada.setaumentarBrilho(scanner.nextInt());
        System.out.println("Brilho:" + lampada.getBrilho());
    }
}
