package com.Acompanha.entities;

public class Idoso extends Pessoa{
    private String dataNascimento;
    private Familiar reponsavel;

    //metodo construtor vazio
    public Idoso() {
    }

    //metodo construtor cheio
    public Idoso(int id, String nome, String telefone, String dataNascimento, Familiar reponsavel) {
        super(id, nome, telefone);
        this.dataNascimento = dataNascimento;
        this.reponsavel = reponsavel;
    }

    //getters e setters
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Familiar getReponsavel() {
        return reponsavel;
    }

    public void setReponsavel(Familiar reponsavel) {
        this.reponsavel = reponsavel;
    }

    //toString

    @Override
    public String toString() {
        return "Idoso" +
                "dataNascimento='" + dataNascimento + '\'' +
                ", reponsavel=" + reponsavel +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone;
    }
}
