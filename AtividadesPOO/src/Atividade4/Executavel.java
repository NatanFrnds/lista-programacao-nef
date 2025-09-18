package Atividade4;

public class Executavel {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fulano");
        Vendedor auxiliar= new Vendedor("Pablo");
        Gerente gerente = new Gerente("Natan");
        auxiliar.setComissao(1.2);
        System.out.println("O auxiliar "+auxiliar.getNome()+" tem salario de: "+auxiliar.getcalcularPagamento());
    }
}
