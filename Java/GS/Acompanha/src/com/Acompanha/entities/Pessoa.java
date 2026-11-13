package com.Acompanha.entities;

public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String telefone;

    //metodos construtores vazios
    public Pessoa() {
    }

    //metodos construtores cheio
    public Pessoa(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //toString

    @Override
    public String toString() {
        return "Pessoa" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone;
    }
}
