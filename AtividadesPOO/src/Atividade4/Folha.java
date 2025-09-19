package Atividade4;

public class Folha {
    public void pagar(Funcionario f) {
        System.out.println("Pagando com sucesso: " + f.getNome() +
                " Salario: " + f.getcalcularPagamento());
        System.out.println();
    }

}

