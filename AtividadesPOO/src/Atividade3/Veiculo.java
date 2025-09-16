package Atividade3;

public class Veiculo {
    private String marca;
    private String modelo;
    private double velocidade;
    String Descricao;

    public Veiculo() {
        this.marca = "Chevrolet";
        this.modelo = "Vectra";
        this.velocidade = 190;
        this.Descricao = "Luxo anos 2000";
    }

    public Veiculo(String marca, String modelo, double velocidade, String Descricao) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.Descricao = Descricao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca=marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
         this.modelo=modelo ;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAcelerar() {
        return this.velocidade;
    }

    public void acelerar(double acelerar) {
        this.velocidade += acelerar;
    }

    public double getfrear() {
        return this.velocidade;
    }

    public void frear(double frear) {
        this.velocidade -= frear;
    }

    public String descricao() {
        return this.descricao();
    }

    public void descricao(String descricao) {
        this.Descricao = descricao;
    }
}
