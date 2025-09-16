package Atividade3;

public class Carro extends Veiculo {
    private int portas;

    public Carro() {
        super();
    }

    public Carro(String marca, String modelo, double velocidade, String Descricao,
                 int portas) {
    super(marca,modelo,velocidade,Descricao);
    this.portas=portas;

    }
public void falar(){
    System.out.println(getMarca()+" "+getModelo()+" "+getVelocidade());
}


}


