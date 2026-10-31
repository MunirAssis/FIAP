package br.com.fiap.entities;

public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String email;
    protected String telefone;

    //metodo construtor vazio
    public Pessoa() {
    }

    //metodo contrutor cheio
    public Pessoa(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", email='" + email + '\'' +
                ", telefone='" + telefone ;
    }
}
