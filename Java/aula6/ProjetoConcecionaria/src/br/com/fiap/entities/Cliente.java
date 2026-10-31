package br.com.fiap.entities;

public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private int idade;

    //metodo contrutor vazio

    public Cliente() {
    }

    //metodo contrutor cheio

    public Cliente(String cpf, String nome, String email, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    //getter e setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //toString

    @Override
    public String toString() {
        return "Cliente" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade;
    }
}
