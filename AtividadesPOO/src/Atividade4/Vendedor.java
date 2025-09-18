package Atividade4;

public class Vendedor extends Funcionario {
    double comissao;

    public Vendedor(){
        super();
        this.comissao = 0;
    }

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao=comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
        super.setcalcularPagamento(getSalarioBase()+comissao);
    }

}
