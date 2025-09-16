package Atividade3;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto() {
        super();
        this.cilindradas = 125;
        this.setMarca(getMarca());
        this.setModelo(getModelo());
        this.setVelocidade(getVelocidade());
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void setMarca(String marca) {
        marca = "honda";
        super.setMarca(marca);
    }

    public void setModelo(String modelo) {
        modelo = "CG125";
        super.setModelo(modelo);
    }

    public void setVelocidade(double velocidade) {
        velocidade = 200;
        super.setVelocidade(velocidade);
    }

    public void falar() {
        System.out.println(getMarca() + " " + getModelo() + " " + getVelocidade() + " " + getCilindradas());
    }
}

