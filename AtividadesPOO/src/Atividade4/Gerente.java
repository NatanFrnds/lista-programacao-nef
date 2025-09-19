package Atividade4;


public class Gerente extends Funcionario {
    double bonus;

    public Gerente() {
        super();
        this.bonus = 0;
    }

    public Gerente(String nome) {
        super(nome);
    }


    public double getBonus() {
        return this.bonus;
    }

    public void setComissao(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getcalcularPagamento() {
        final double salarioBase = super.getSalarioBase();
        return salarioBase+this.bonus;
    }

}

