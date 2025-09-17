package Atividade3;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto() {
        super();
        this.cilindradas = 125;
        this.setMarca(getMarca());
        this.setModelo(getModelo());
        this.setVelocidade(getVelocidade());
        this.setDescricao(getDescricao());
    }

    public Moto(String marca, String modelo, double velocidade, String descricao, int cilindradas) {
        super(marca, modelo, velocidade, descricao);
        this.descricao = descricao;
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void setMarca(String marca) {

        super.setMarca(marca);
    }

    public void setModelo(String modelo) {

        super.setModelo(modelo);
    }

    public void setVelocidade(double velocidade) {

        super.setVelocidade(velocidade);
    }

    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    public void falar() {
        System.out.println("Marca do veiculo: " + getMarca() + "\nModelo do veiculo: " + getModelo() + " \nVelocidade maxima do veiuclo: " + getVelocidade() + "\nDescrição do veiuclo: " + getDescricao() + "\nCilindradas: " + getCilindradas());
    }
}

