package Atividade4;

public class Executavel {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fulano");
        Vendedor auxiliar = new Vendedor("Auxiliar Pablo");
        Gerente gerente = new Gerente("Natan");
        Folha folha = new Folha();
        auxiliar.setComissao(1.2);
        gerente.setComissao(1200);
        folha.pagar(f1);
        folha.pagar(auxiliar);
        folha.pagar(gerente);
    }
}