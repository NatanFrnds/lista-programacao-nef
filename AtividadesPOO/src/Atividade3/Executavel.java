package Atividade3;

public class Executavel {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto("Honda","CG125",200,"Melhor moto criada",125);
        carro.falar();
        moto.falar();
    }
}
