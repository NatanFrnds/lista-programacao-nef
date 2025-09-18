package Atividade4;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario() {
        this.nome = "";
        this.salarioBase = 0;
    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getcalcularPagamento() {
        return salarioBase;
    }

    public void setcalcularPagamento(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
