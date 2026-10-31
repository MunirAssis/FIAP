package br.com.fiap.entities;

public class cliente {
    private String nome;
    private String cpf;
    private int idade;
    private double altura;
    private endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    public void setnome() {
    }
}
