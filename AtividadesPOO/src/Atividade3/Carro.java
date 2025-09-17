package Atividade3;

public class Carro extends Veiculo {
    private int portas;

    public Carro() {
        super();
        this.portas=4;
    }

    public Carro(String marca, String modelo, double velocidade, String Descricao, int portas){
    super(marca,modelo,velocidade,Descricao);
    this.portas=portas;
    }


    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
public void falar(){
    System.out.println("Marca do veiculo: "+getMarca()+"\nModelo do veiculo: "+getModelo()+" \nVelocidade maxima do veiuclo: "+getVelocidade()+"\nDescrição do veiuclo: "+getDescricao()+"\nNumeros de portas: "+getPortas());
}
}


