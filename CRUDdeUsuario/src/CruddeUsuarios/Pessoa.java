package CruddeUsuarios;

import java.util.Date;

public class Pessoa {
    private String Nome;
    String Sobrenome;
    private Date DataNascimento;
    String Telefone;
    char Sexo;
    String Endereco;
    private int Idade;

    public Pessoa() {
        this.Nome = "";
        this.Sobrenome = "";
        this.DataNascimento = new Date();
        this.Telefone = "";
        this.Sexo = 'M';
        this.Endereco = "";
        this.Idade=0;
    }

    public Pessoa(String nome, String sobrenome, Date dataNascimento, String telefone, char sexo, String endereco, int idade) {
        this.Nome = nome;
        this.Sobrenome = sobrenome;
        this.DataNascimento =dataNascimento;
        this.Telefone = telefone;
        this.Sexo = sexo;
        this.Endereco = endereco;
        this.Idade=idade;
    }

    public void setNome(String nome) {
        this.Nome=nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setSobrenome(String sobrenome) {
        this.Sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return this.Sobrenome;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public void setTelefone(String telefone) {
        this.Telefone=telefone;
    }

    public String getTelefone(){
        return this.Telefone;
    }

    public void setSexo(char sexo){
        this.Sexo=sexo;
    }

    public char getSexo(){
        return this.Sexo;
    }

    public void setEndereco(String endereco){
        this.Endereco=endereco;
    }

    public String getEndereco(){
        return this.Endereco;
    }

    public int getIdade(){
        Date currentDate=new Date();
        this.Idade= currentDate.getYear()-this.DataNascimento.getYear();
        return this.Idade;
    }

    public String getFullSexo(){
        if (this.Sexo=='M'|| this.Sexo=='m'){
            return "Masculino";
        }else if (this.Sexo=='F'|| this.Sexo=='f'){
            return "Feminino";
        }else{
            return"";
        }

    }

    public void info(){
        System.out.println("Nome: "+getNome()+"\nSobrenome: "+"\nData de Nascimento: "+getIdade()+getSobrenome()+"\nTelefone: "+ getTelefone()+ "\nSexo: "+
                getFullSexo()+"\nEndereço: "+ getEndereco());
    }

}




