package Atividade4;


public class Gerente extends Funcionario {
    double comissao;

    public Gerente() {
        super();
        this.comissao = 0;
    }

    public Gerente(String nome) {
        super(nome);
    }


    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getcalcularPagamento() {
        final double salarioBase = super.getSalarioBase();
        return salarioBase+this.comissao;
    }

}

