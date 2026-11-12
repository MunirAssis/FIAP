package br.com.fiap.entities;

public class Categoria {
    private int codigo;
    private String nome;
    private String descricao;
    private String pratileira;
    private int capacidade;


    //constructor vazio

    public Categoria() {
    }

    //constructor cheio

    public Categoria(int codigo, String nome, String descricao, String pratileira, int capacidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.pratileira = pratileira;
        this.capacidade = capacidade;
    }

    //getters e setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPratileira() {
        return pratileira;
    }

    public void setPratileira(String pratileira) {
        this.pratileira = pratileira;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    //toString

    @Override
    public String toString() {
        return "\n\nCategoria" +
                "\ncodigo=" + codigo +
                "\nnome='" + nome + '\'' +
                "\ndescricao='" + descricao + '\'' +
                "\npratileira='" + pratileira + '\'' +
                "\ncapacidade='" + capacidade;
    }
}
