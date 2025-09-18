package Atividade4;

public class Vendedor extends Funcionario {
    double comissao;

    public Vendedor() {
        super();
        this.comissao = 0;
    }

    public Vendedor(String nome) {
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
