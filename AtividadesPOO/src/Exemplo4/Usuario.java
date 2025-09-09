package Exemplo4;

public class Usuario extends Pessoa {
    private String username;
    private String password;

    public Usuario() {
        super();
    }

    public Usuario(String nome, int idade, String username, String password) {
        super(idade, nome);
        this.username = username;
        this.password = password;
    }
    public void falar() {

        System.out.println("Oi eu sou " + this.getNome()+ "eu tenho "+this.getIdade()+ " anos de idade");
        System.out.println("Meu nome de usuario é : "+this.username);
    }

}
