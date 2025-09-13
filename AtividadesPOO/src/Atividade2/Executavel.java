package Atividade2;

import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria cb = new ContaBancaria("Natan", "40028922", 1000);
        ContaBancaria cb2 = new ContaBancaria("Kauan", "40028923", 998);

        System.out.println("Digite o valor que deseja depositar: ");
        cb.setDepositar(cb.getSaldo(), scanner.nextDouble());
        System.out.println("Foi depositado: "+cb.getDeposito());
        System.out.println("Digite o valor que deseja sacar: ");
        cb.setSacar(cb.getSaldo(), scanner.nextDouble());
        System.out.println("Foi sacado: "+cb.getSaque()+" o valor restante na conta é: "+cb.getSaldo());
        System.out.println("Digite o valor que deseja trasnferir para : "+ cb2.getNome());
        cb.setTransferencia(cb.getSaldo(), scanner.nextDouble());
        cb2.setPostrasnferencia(cb2.getSaldo(), cb.getTransferencia());
        System.out.println("o Saldo de: "+cb.getNome()+" é "+ cb.getSaldo()+" foi transferido: " + cb.getTransferencia()+". Para "+
                cb2.getNome()+" que tem: " + cb2.getPostrasnferencia());


    }
}
