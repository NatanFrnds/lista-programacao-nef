package Atividade2;

class ContaBancaria {
    private String nome;
    private String numero;
    private double saldo;
    public double saque;
    public double deposito;
    public double transferir;
    private double postrasnferencia;

    public ContaBancaria() {
        this.nome = "";
        this.numero = "";
        this.saldo = 0;
        this.saque = 0;
        this.deposito = 0;
        this.transferir = 0;
        this.postrasnferencia = 0;

    }

    public ContaBancaria(String nome, String numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.saque = 0;
        this.deposito = 0;
        this.transferir = 0;
        this.postrasnferencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        if (saldo < 0) {
            saldo = 0;
            return saldo;
        } else {
            return saldo;
        }
    }

    public void setDepositar(double saldo, double depositar) {
        saldo = this.saldo;
        depositar = depositar;
        this.saldo = saldo + depositar;
        this.deposito = depositar;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSacar(double saldo, double sacar) {
        saldo = this.saldo;
        sacar = sacar;
        this.saldo = saldo - sacar;
        this.saque = sacar;
    }

    public double getTransferencia() {
        return this.transferir;
    }

    public void setTransferencia(double saldo, double transferencia) {
        saldo = this.saldo;
        this.transferir = transferencia;
        this.saldo = saldo - transferencia;

    }

    public double getPostrasnferencia() {
        return this.postrasnferencia;
    }

    public void setPostrasnferencia(double saldo, double transferencia) {
        saldo = this.saldo;
        this.transferir = transferencia;
        this.postrasnferencia= saldo + transferencia;
    }
}