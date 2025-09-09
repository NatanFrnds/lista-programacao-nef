package Exemplo4;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {

        return this.idade;
    }

    public void setIdade(int valor) {

        this.idade = valor;
    }

    public String getNome() {
        return this.nome;
    }


    public void setNome(String escrita) {

        this.nome = escrita;
    }

    public void falar() {

        System.out.println("novo nome: " + this.nome);
    }
}