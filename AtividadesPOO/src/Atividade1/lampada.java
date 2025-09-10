package Atividade1;

public class lampada {

    private boolean ligada;
    private int brilho = 0;
    private String cor = "";

    public lampada() {
        this.ligada = false;
        this.brilho = 0;
        this.cor = "branca";
    }

    public lampada(boolean ligada, int brilho, String cor) {
        this.ligada = ligada;
        this.brilho = brilho;
        this.cor = cor;
    }

    public boolean getLigar() {
        return !this.ligada;
    }

    public void setLigar() {
        this.ligada = true;
    }


    public boolean getDesligar() {
        return this.ligada;
    }

    public void setDesligar() {
        this.ligada = false;
    }

    public int getBrilho() {
        return this.brilho;
    }

    public void setreduzirBrilho(int valor) {
        if ((this.brilho-valor) < 0) {
            valor=0;
            this.brilho =valor;
        } else {
            this.brilho =valor;
        }
    }

public void setaumentarBrilho(int valor) {
    if ((this.brilho+valor) > 100) {
        valor=100;
        this.brilho =valor;
    } else {
        this.brilho =valor;
    }

}

public String getCor() {
    return this.cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public void falar() {
    System.out.println(getLigar());
}

}
