package br.com.fiap.entities;

public class Cliente {
    // visibilidade, tipo de dados
    private String nome; // braufragelio
    private String cpf;  //222.222.222/22
    private int idade;  //42
    // private long idade;
    //  private short idade;
    private double altura;  //1.70f

    // metodos getter(saidas) e setters (entradas)

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
}
