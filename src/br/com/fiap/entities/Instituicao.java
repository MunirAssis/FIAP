package br.com.fiap.entities;

public class Instituicao extends Pessoa {
    private String cnpj;
    private String causa;

    //metodo construtor vazio
    public Instituicao() {
    }

    //metodo construção  cheio
    public Instituicao(String cnpj, String causa) {
        this.cnpj = cnpj;
        this.causa = causa;
    }

    public Instituicao(int id, String nome, String email, String telefone, String cnpj, String causa) {
        super(id, nome, email, telefone);
        this.cnpj = cnpj;
        this.causa = causa;
    }

    //metodo de funcionalidade que manda os dados para Pessoa
    @Override
    public void exibirDados() {
        System.out.println("Instituição: " + getNome());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Causa: " + causa);
        System.out.println("Contato; " + getEmail() + "/" + getTelefone());
    }

    //getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    //toString

    @Override
    public String toString() {
        return "Instituicao" +
                "cnpj='" + cnpj + '\'' +
                ", causa='" + causa + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone;
    }
}
