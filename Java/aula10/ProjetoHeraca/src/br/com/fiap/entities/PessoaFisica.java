package br.com.fiap.entities;

public class PessoaFisica extends Pessoa {

    // visibilidade, tipo de dados e atributo
    private String cpf;
    private String rg;

    // metodo construtor com parametro vazio
    public PessoaFisica() {
    }

    // metodo construtor com parametro cheio e herança
    public PessoaFisica(String nome, String email, String fone, double renda, String cpf, String rg) {
        super(nome, email, fone, renda);
        this.cpf = cpf;
        this.rg = rg;

    }

    // metodos getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica" +
                "\nCPF='" + cpf + '\'' +
                "\nRG='" + rg + '\'' +
                "\nNome='" + nome + '\'' +
                "\nEmail='" + email + '\'' +
                "\nFone='" + fone + '\'' +
                "\nRenda=" + renda;
    }
}
